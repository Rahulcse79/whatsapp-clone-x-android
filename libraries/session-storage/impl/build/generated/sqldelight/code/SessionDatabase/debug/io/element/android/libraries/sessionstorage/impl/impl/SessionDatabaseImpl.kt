package io.element.android.libraries.sessionstorage.`impl`.`impl`

import app.cash.sqldelight.TransacterImpl
import app.cash.sqldelight.db.AfterVersion
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import io.element.android.libraries.matrix.session.SessionDataQueries
import io.element.android.libraries.sessionstorage.`impl`.SessionDatabase
import kotlin.Long
import kotlin.Unit
import kotlin.reflect.KClass

internal val KClass<SessionDatabase>.schema: SqlSchema<QueryResult.Value<Unit>>
  get() = SessionDatabaseImpl.Schema

internal fun KClass<SessionDatabase>.newInstance(driver: SqlDriver): SessionDatabase = SessionDatabaseImpl(driver)

private class SessionDatabaseImpl(
  driver: SqlDriver,
) : TransacterImpl(driver),
    SessionDatabase {
  override val sessionDataQueries: SessionDataQueries = SessionDataQueries(driver)

  public object Schema : SqlSchema<QueryResult.Value<Unit>> {
    override val version: Long
      get() = 11

    override fun create(driver: SqlDriver): QueryResult.Value<Unit> {
      driver.execute(null, """
          |CREATE TABLE SessionData (
          |    userId TEXT NOT NULL PRIMARY KEY,
          |    deviceId TEXT NOT NULL,
          |    accessToken TEXT NOT NULL,
          |    refreshToken TEXT,
          |    homeserverUrl TEXT NOT NULL,
          |    -- added in version 2
          |    loginTimestamp INTEGER,
          |    -- added in version 3
          |    oidcData TEXT,
          |    -- added in version 4
          |    isTokenValid INTEGER NOT NULL DEFAULT 1,
          |    loginType TEXT,
          |    -- added in version 5
          |    passphrase TEXT,
          |    -- added in version 6
          |    sessionPath TEXT NOT NULL DEFAULT "",
          |    -- added in version 9
          |    cachePath TEXT NOT NULL DEFAULT "",
          |    -- added in version 10
          |    -- position, to be able to sort account by session creation date
          |    position INTEGER NOT NULL DEFAULT 0,
          |    -- index of the last usage session. Each time the current session change, the index of the current
          |    -- session is incremented to the max value + 1 so it becomes the current session
          |    lastUsageIndex INTEGER NOT NULL DEFAULT 0,
          |    -- user display name
          |    userDisplayName TEXT,
          |    -- user avatar url
          |    userAvatarUrl TEXT
          |)
          """.trimMargin(), 0)
      return QueryResult.Unit
    }

    private fun migrateInternal(
      driver: SqlDriver,
      oldVersion: Long,
      newVersion: Long,
    ): QueryResult.Value<Unit> {
      if (oldVersion <= 1 && newVersion > 1) {
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN loginTimestamp INTEGER", 0)
      }
      if (oldVersion <= 2 && newVersion > 2) {
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN oidcData TEXT", 0)
      }
      if (oldVersion <= 3 && newVersion > 3) {
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN isTokenValid INTEGER NOT NULL DEFAULT 1", 0)
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN loginType TEXT", 0)
      }
      if (oldVersion <= 4 && newVersion > 4) {
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN passphrase TEXT", 0)
      }
      if (oldVersion <= 5 && newVersion > 5) {
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN needsVerification INTEGER NOT NULL DEFAULT 1", 0)
      }
      if (oldVersion <= 6 && newVersion > 6) {
        driver.execute(null, """
            |CREATE TABLE SessionData_bak (
            |    userId TEXT NOT NULL PRIMARY KEY,
            |    deviceId TEXT NOT NULL,
            |    accessToken TEXT NOT NULL,
            |    refreshToken TEXT,
            |    homeserverUrl TEXT NOT NULL,
            |    slidingSyncProxy TEXT,
            |    loginTimestamp INTEGER,
            |    oidcData TEXT,
            |    isTokenValid INTEGER NOT NULL DEFAULT 1,
            |    loginType TEXT,
            |    passphrase TEXT
            |)
            """.trimMargin(), 0)
        driver.execute(null, "INSERT INTO SessionData_bak SELECT userId, deviceId, accessToken, refreshToken, homeserverUrl, slidingSyncProxy, loginTimestamp, oidcData, isTokenValid, loginType, passphrase FROM SessionData", 0)
        driver.execute(null, "DROP TABLE SessionData", 0)
        driver.execute(null, "ALTER TABLE SessionData_bak RENAME TO SessionData", 0)
      }
      if (oldVersion <= 7 && newVersion > 7) {
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN sessionPath TEXT NOT NULL DEFAULT \"\"", 0)
      }
      if (oldVersion <= 8 && newVersion > 8) {
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN cachePath TEXT NOT NULL DEFAULT \"\"", 0)
      }
      if (oldVersion <= 9 && newVersion > 9) {
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN position INTEGER NOT NULL DEFAULT 0", 0)
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN lastUsageIndex INTEGER NOT NULL DEFAULT 0", 0)
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN userDisplayName TEXT", 0)
        driver.execute(null, "ALTER TABLE SessionData ADD COLUMN userAvatarUrl TEXT", 0)
      }
      if (oldVersion <= 10 && newVersion > 10) {
        driver.execute(null, """
            |CREATE TABLE SessionData_bak (
            |    userId TEXT NOT NULL PRIMARY KEY,
            |    deviceId TEXT NOT NULL,
            |    accessToken TEXT NOT NULL,
            |    refreshToken TEXT,
            |    homeserverUrl TEXT NOT NULL,
            |    loginTimestamp INTEGER,
            |    oidcData TEXT,
            |    isTokenValid INTEGER NOT NULL DEFAULT 1,
            |    loginType TEXT,
            |    passphrase TEXT,
            |    sessionPath TEXT NOT NULL DEFAULT "",
            |    cachePath TEXT NOT NULL DEFAULT "",
            |    position INTEGER NOT NULL DEFAULT 0,
            |    lastUsageIndex INTEGER NOT NULL DEFAULT 0,
            |    userDisplayName TEXT,
            |    userAvatarUrl TEXT
            |)
            """.trimMargin(), 0)
        driver.execute(null, """
            |INSERT INTO SessionData_bak SELECT
            |    userId,
            |    deviceId,
            |    accessToken,
            |    refreshToken,
            |    homeserverUrl,
            |    loginTimestamp,
            |    oidcData,
            |    isTokenValid,
            |    loginType,
            |    passphrase,
            |    sessionPath,
            |    cachePath,
            |    position,
            |    lastUsageIndex,
            |    userDisplayName,
            |    userAvatarUrl FROM SessionData
            """.trimMargin(), 0)
        driver.execute(null, "DROP TABLE SessionData", 0)
        driver.execute(null, "ALTER TABLE SessionData_bak RENAME TO SessionData", 0)
      }
      return QueryResult.Unit
    }

    override fun migrate(
      driver: SqlDriver,
      oldVersion: Long,
      newVersion: Long,
      vararg callbacks: AfterVersion,
    ): QueryResult.Value<Unit> {
      var lastVersion = oldVersion

      callbacks.filter { it.afterVersion in oldVersion until newVersion }
      .sortedBy { it.afterVersion }
      .forEach { callback ->
        migrateInternal(driver, oldVersion = lastVersion, newVersion = callback.afterVersion + 1)
        callback.block(driver)
        lastVersion = callback.afterVersion + 1
      }

      if (lastVersion < newVersion) {
        migrateInternal(driver, lastVersion, newVersion)
      }
      return QueryResult.Unit
    }
  }
}
