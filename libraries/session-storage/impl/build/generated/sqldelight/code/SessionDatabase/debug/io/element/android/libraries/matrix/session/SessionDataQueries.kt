package io.element.android.libraries.matrix.session

import app.cash.sqldelight.Query
import app.cash.sqldelight.TransacterImpl
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlCursor
import app.cash.sqldelight.db.SqlDriver
import kotlin.Any
import kotlin.Long
import kotlin.String

public class SessionDataQueries(
  driver: SqlDriver,
) : TransacterImpl(driver) {
  public fun <T : Any> selectLatest(mapper: (
    userId: String,
    deviceId: String,
    accessToken: String,
    refreshToken: String?,
    homeserverUrl: String,
    loginTimestamp: Long?,
    oidcData: String?,
    isTokenValid: Long,
    loginType: String?,
    passphrase: String?,
    sessionPath: String,
    cachePath: String,
    position: Long,
    lastUsageIndex: Long,
    userDisplayName: String?,
    userAvatarUrl: String?,
  ) -> T): Query<T> = Query(1_577_351_182, arrayOf("SessionData"), driver, "SessionData.sq", "selectLatest", "SELECT SessionData.userId, SessionData.deviceId, SessionData.accessToken, SessionData.refreshToken, SessionData.homeserverUrl, SessionData.loginTimestamp, SessionData.oidcData, SessionData.isTokenValid, SessionData.loginType, SessionData.passphrase, SessionData.sessionPath, SessionData.cachePath, SessionData.position, SessionData.lastUsageIndex, SessionData.userDisplayName, SessionData.userAvatarUrl FROM SessionData ORDER BY lastUsageIndex DESC LIMIT 1") { cursor ->
    mapper(
      cursor.getString(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3),
      cursor.getString(4)!!,
      cursor.getLong(5),
      cursor.getString(6),
      cursor.getLong(7)!!,
      cursor.getString(8),
      cursor.getString(9),
      cursor.getString(10)!!,
      cursor.getString(11)!!,
      cursor.getLong(12)!!,
      cursor.getLong(13)!!,
      cursor.getString(14),
      cursor.getString(15)
    )
  }

  public fun selectLatest(): Query<SessionData> = selectLatest(::SessionData)

  public fun <T : Any> selectAll(mapper: (
    userId: String,
    deviceId: String,
    accessToken: String,
    refreshToken: String?,
    homeserverUrl: String,
    loginTimestamp: Long?,
    oidcData: String?,
    isTokenValid: Long,
    loginType: String?,
    passphrase: String?,
    sessionPath: String,
    cachePath: String,
    position: Long,
    lastUsageIndex: Long,
    userDisplayName: String?,
    userAvatarUrl: String?,
  ) -> T): Query<T> = Query(-2_107_722_118, arrayOf("SessionData"), driver, "SessionData.sq", "selectAll", "SELECT SessionData.userId, SessionData.deviceId, SessionData.accessToken, SessionData.refreshToken, SessionData.homeserverUrl, SessionData.loginTimestamp, SessionData.oidcData, SessionData.isTokenValid, SessionData.loginType, SessionData.passphrase, SessionData.sessionPath, SessionData.cachePath, SessionData.position, SessionData.lastUsageIndex, SessionData.userDisplayName, SessionData.userAvatarUrl FROM SessionData ORDER BY lastUsageIndex DESC") { cursor ->
    mapper(
      cursor.getString(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3),
      cursor.getString(4)!!,
      cursor.getLong(5),
      cursor.getString(6),
      cursor.getLong(7)!!,
      cursor.getString(8),
      cursor.getString(9),
      cursor.getString(10)!!,
      cursor.getString(11)!!,
      cursor.getLong(12)!!,
      cursor.getLong(13)!!,
      cursor.getString(14),
      cursor.getString(15)
    )
  }

  public fun selectAll(): Query<SessionData> = selectAll(::SessionData)

  public fun count(): Query<Long> = Query(646_459_140, arrayOf("SessionData"), driver, "SessionData.sq", "count", "SELECT count(*) FROM SessionData") { cursor ->
    cursor.getLong(0)!!
  }

  public fun <T : Any> selectByUserId(userId: String, mapper: (
    userId: String,
    deviceId: String,
    accessToken: String,
    refreshToken: String?,
    homeserverUrl: String,
    loginTimestamp: Long?,
    oidcData: String?,
    isTokenValid: Long,
    loginType: String?,
    passphrase: String?,
    sessionPath: String,
    cachePath: String,
    position: Long,
    lastUsageIndex: Long,
    userDisplayName: String?,
    userAvatarUrl: String?,
  ) -> T): Query<T> = SelectByUserIdQuery(userId) { cursor ->
    mapper(
      cursor.getString(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3),
      cursor.getString(4)!!,
      cursor.getLong(5),
      cursor.getString(6),
      cursor.getLong(7)!!,
      cursor.getString(8),
      cursor.getString(9),
      cursor.getString(10)!!,
      cursor.getString(11)!!,
      cursor.getLong(12)!!,
      cursor.getLong(13)!!,
      cursor.getString(14),
      cursor.getString(15)
    )
  }

  public fun selectByUserId(userId: String): Query<SessionData> = selectByUserId(userId, ::SessionData)

  /**
   * @return The number of rows updated.
   */
  public fun insertSessionData(SessionData: SessionData): QueryResult<Long> {
    val result = driver.execute(-1_037_014_692, """INSERT INTO SessionData (userId, deviceId, accessToken, refreshToken, homeserverUrl, loginTimestamp, oidcData, isTokenValid, loginType, passphrase, sessionPath, cachePath, position, lastUsageIndex, userDisplayName, userAvatarUrl) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)""", 16) {
          var parameterIndex = 0
          bindString(parameterIndex++, SessionData.userId)
          bindString(parameterIndex++, SessionData.deviceId)
          bindString(parameterIndex++, SessionData.accessToken)
          bindString(parameterIndex++, SessionData.refreshToken)
          bindString(parameterIndex++, SessionData.homeserverUrl)
          bindLong(parameterIndex++, SessionData.loginTimestamp)
          bindString(parameterIndex++, SessionData.oidcData)
          bindLong(parameterIndex++, SessionData.isTokenValid)
          bindString(parameterIndex++, SessionData.loginType)
          bindString(parameterIndex++, SessionData.passphrase)
          bindString(parameterIndex++, SessionData.sessionPath)
          bindString(parameterIndex++, SessionData.cachePath)
          bindLong(parameterIndex++, SessionData.position)
          bindLong(parameterIndex++, SessionData.lastUsageIndex)
          bindString(parameterIndex++, SessionData.userDisplayName)
          bindString(parameterIndex++, SessionData.userAvatarUrl)
        }
    notifyQueries(-1_037_014_692) { emit ->
      emit("SessionData")
    }
    return result
  }

  /**
   * @return The number of rows updated.
   */
  public fun removeSession(userId: String): QueryResult<Long> {
    val result = driver.execute(-138_125_721, """DELETE FROM SessionData WHERE userId = ?""", 1) {
          var parameterIndex = 0
          bindString(parameterIndex++, userId)
        }
    notifyQueries(-138_125_721) { emit ->
      emit("SessionData")
    }
    return result
  }

  /**
   * @return The number of rows updated.
   */
  public fun updateSession(SessionData: SessionData): QueryResult<Long> {
    val result = driver.execute(1_465_398_914, """REPLACE INTO SessionData (userId, deviceId, accessToken, refreshToken, homeserverUrl, loginTimestamp, oidcData, isTokenValid, loginType, passphrase, sessionPath, cachePath, position, lastUsageIndex, userDisplayName, userAvatarUrl) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)""", 16) {
          var parameterIndex = 0
          bindString(parameterIndex++, SessionData.userId)
          bindString(parameterIndex++, SessionData.deviceId)
          bindString(parameterIndex++, SessionData.accessToken)
          bindString(parameterIndex++, SessionData.refreshToken)
          bindString(parameterIndex++, SessionData.homeserverUrl)
          bindLong(parameterIndex++, SessionData.loginTimestamp)
          bindString(parameterIndex++, SessionData.oidcData)
          bindLong(parameterIndex++, SessionData.isTokenValid)
          bindString(parameterIndex++, SessionData.loginType)
          bindString(parameterIndex++, SessionData.passphrase)
          bindString(parameterIndex++, SessionData.sessionPath)
          bindString(parameterIndex++, SessionData.cachePath)
          bindLong(parameterIndex++, SessionData.position)
          bindLong(parameterIndex++, SessionData.lastUsageIndex)
          bindString(parameterIndex++, SessionData.userDisplayName)
          bindString(parameterIndex++, SessionData.userAvatarUrl)
        }
    notifyQueries(1_465_398_914) { emit ->
      emit("SessionData")
    }
    return result
  }

  private inner class SelectByUserIdQuery<out T : Any>(
    public val userId: String,
    mapper: (SqlCursor) -> T,
  ) : Query<T>(mapper) {
    override fun addListener(listener: Query.Listener) {
      driver.addListener("SessionData", listener = listener)
    }

    override fun removeListener(listener: Query.Listener) {
      driver.removeListener("SessionData", listener = listener)
    }

    override fun <R> execute(mapper: (SqlCursor) -> QueryResult<R>): QueryResult<R> = driver.executeQuery(-1_586_942_908, """SELECT SessionData.userId, SessionData.deviceId, SessionData.accessToken, SessionData.refreshToken, SessionData.homeserverUrl, SessionData.loginTimestamp, SessionData.oidcData, SessionData.isTokenValid, SessionData.loginType, SessionData.passphrase, SessionData.sessionPath, SessionData.cachePath, SessionData.position, SessionData.lastUsageIndex, SessionData.userDisplayName, SessionData.userAvatarUrl FROM SessionData WHERE userId = ?""", mapper, 1) {
      var parameterIndex = 0
      bindString(parameterIndex++, userId)
    }

    override fun toString(): String = "SessionData.sq:selectByUserId"
  }
}
