package io.element.android.libraries.push.`impl`.db

import app.cash.sqldelight.Query
import app.cash.sqldelight.TransacterImpl
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlCursor
import app.cash.sqldelight.db.SqlDriver
import kotlin.Any
import kotlin.Long
import kotlin.String

public class PushRequestQueries(
  driver: SqlDriver,
) : TransacterImpl(driver) {
  public fun <T : Any> selectAllPendingForSession(
    sessionId: String,
    pushDate: Long,
    mapper: (
      pushDate: Long,
      providerInfo: String,
      eventId: String,
      roomId: String,
      sessionId: String,
      status: Long,
      retries: Long,
    ) -> T,
  ): Query<T> = SelectAllPendingForSessionQuery(sessionId, pushDate) { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2)!!,
      cursor.getString(3)!!,
      cursor.getString(4)!!,
      cursor.getLong(5)!!,
      cursor.getLong(6)!!
    )
  }

  public fun selectAllPendingForSession(sessionId: String, pushDate: Long): Query<PushRequest> = selectAllPendingForSession(sessionId, pushDate, ::PushRequest)

  /**
   * @return The number of rows updated.
   */
  public fun insertPushRequest(PushRequest: PushRequest): QueryResult<Long> {
    val result = driver.execute(-1_143_560_179, """INSERT OR REPLACE INTO PushRequest (pushDate, providerInfo, eventId, roomId, sessionId, status, retries) VALUES (?, ?, ?, ?, ?, ?, ?)""", 7) {
          var parameterIndex = 0
          bindLong(parameterIndex++, PushRequest.pushDate)
          bindString(parameterIndex++, PushRequest.providerInfo)
          bindString(parameterIndex++, PushRequest.eventId)
          bindString(parameterIndex++, PushRequest.roomId)
          bindString(parameterIndex++, PushRequest.sessionId)
          bindLong(parameterIndex++, PushRequest.status)
          bindLong(parameterIndex++, PushRequest.retries)
        }
    notifyQueries(-1_143_560_179) { emit ->
      emit("PushRequest")
    }
    return result
  }

  /**
   * @return The number of rows updated.
   */
  public fun removeAll(): QueryResult<Long> {
    val result = driver.execute(-1_930_624_530, """DELETE FROM PushRequest""", 0)
    notifyQueries(-1_930_624_530) { emit ->
      emit("PushRequest")
    }
    return result
  }

  /**
   * @return The number of rows updated.
   */
  public fun removeOldest(`value`: Long): QueryResult<Long> {
    val result = driver.execute(-927_641_966, """DELETE FROM PushRequest WHERE rowid NOT IN (SELECT rowid FROM PushRequest ORDER BY pushDate DESC LIMIT ?)""", 1) {
          var parameterIndex = 0
          bindLong(parameterIndex++, value)
        }
    notifyQueries(-927_641_966) { emit ->
      emit("PushRequest")
    }
    return result
  }

  private inner class SelectAllPendingForSessionQuery<out T : Any>(
    public val sessionId: String,
    public val pushDate: Long,
    mapper: (SqlCursor) -> T,
  ) : Query<T>(mapper) {
    override fun addListener(listener: Query.Listener) {
      driver.addListener("PushRequest", listener = listener)
    }

    override fun removeListener(listener: Query.Listener) {
      driver.removeListener("PushRequest", listener = listener)
    }

    override fun <R> execute(mapper: (SqlCursor) -> QueryResult<R>): QueryResult<R> = driver.executeQuery(-1_017_526_610, """SELECT PushRequest.pushDate, PushRequest.providerInfo, PushRequest.eventId, PushRequest.roomId, PushRequest.sessionId, PushRequest.status, PushRequest.retries FROM PushRequest WHERE status = 0 AND sessionId = ? AND pushDate > ? ORDER BY pushDate ASC""", mapper, 2) {
      var parameterIndex = 0
      bindString(parameterIndex++, sessionId)
      bindLong(parameterIndex++, pushDate)
    }

    override fun toString(): String = "PushRequest.sq:selectAllPendingForSession"
  }
}
