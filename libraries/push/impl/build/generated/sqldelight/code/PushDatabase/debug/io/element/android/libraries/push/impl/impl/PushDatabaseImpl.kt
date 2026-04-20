package io.element.android.libraries.push.`impl`.`impl`

import app.cash.sqldelight.TransacterImpl
import app.cash.sqldelight.db.AfterVersion
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import io.element.android.libraries.push.`impl`.PushDatabase
import io.element.android.libraries.push.`impl`.db.PushHistoryQueries
import io.element.android.libraries.push.`impl`.db.PushRequestQueries
import kotlin.Long
import kotlin.Unit
import kotlin.reflect.KClass

internal val KClass<PushDatabase>.schema: SqlSchema<QueryResult.Value<Unit>>
  get() = PushDatabaseImpl.Schema

internal fun KClass<PushDatabase>.newInstance(driver: SqlDriver): PushDatabase = PushDatabaseImpl(driver)

private class PushDatabaseImpl(
  driver: SqlDriver,
) : TransacterImpl(driver),
    PushDatabase {
  override val pushHistoryQueries: PushHistoryQueries = PushHistoryQueries(driver)

  override val pushRequestQueries: PushRequestQueries = PushRequestQueries(driver)

  public object Schema : SqlSchema<QueryResult.Value<Unit>> {
    override val version: Long
      get() = 2

    override fun create(driver: SqlDriver): QueryResult.Value<Unit> {
      driver.execute(null, """
          |CREATE TABLE PushHistory (
          |    pushDate INTEGER NOT NULL,
          |    providerInfo TEXT NOT NULL,
          |    eventId TEXT,
          |    roomId TEXT,
          |    sessionId TEXT,
          |    hasBeenResolved INTEGER NOT NULL,
          |    comment TEXT
          |)
          """.trimMargin(), 0)
      driver.execute(null, """
          |CREATE TABLE PushRequest (
          |    pushDate INTEGER NOT NULL,
          |    providerInfo TEXT NOT NULL,
          |    eventId TEXT NOT NULL,
          |    roomId TEXT NOT NULL,
          |    sessionId TEXT NOT NULL,
          |    status INTEGER NOT NULL DEFAULT 0,
          |    retries INTEGER NOT NULL DEFAULT 0,
          |    PRIMARY KEY(sessionId, eventId)
          |)
          """.trimMargin(), 0)
      driver.execute(null, "CREATE INDEX PushRequestSessionAndStatus ON PushRequest (sessionId, status)", 0)
      return QueryResult.Unit
    }

    private fun migrateInternal(
      driver: SqlDriver,
      oldVersion: Long,
      newVersion: Long,
    ): QueryResult.Value<Unit> {
      if (oldVersion <= 1 && newVersion > 1) {
        driver.execute(null, """
            |CREATE TABLE PushRequest (
            |    pushDate INTEGER NOT NULL,
            |    providerInfo TEXT NOT NULL,
            |    eventId TEXT NOT NULL,
            |    roomId TEXT NOT NULL,
            |    sessionId TEXT NOT NULL,
            |    status INTEGER NOT NULL DEFAULT 0,
            |    retries INTEGER NOT NULL DEFAULT 0,
            |    PRIMARY KEY(sessionId, eventId)
            |)
            """.trimMargin(), 0)
        driver.execute(null, "CREATE INDEX PushRequestSessionAndStatus ON PushRequest (sessionId, status)", 0)
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
