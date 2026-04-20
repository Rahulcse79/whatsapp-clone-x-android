package io.element.android.libraries.push.`impl`.db

import app.cash.sqldelight.Query
import app.cash.sqldelight.TransacterImpl
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import kotlin.Any
import kotlin.Long
import kotlin.String

public class PushHistoryQueries(
  driver: SqlDriver,
) : TransacterImpl(driver) {
  public fun <T : Any> selectAll(mapper: (
    pushDate: Long,
    providerInfo: String,
    eventId: String?,
    roomId: String?,
    sessionId: String?,
    hasBeenResolved: Long,
    comment: String?,
  ) -> T): Query<T> = Query(473_108_625, arrayOf("PushHistory"), driver, "PushHistory.sq", "selectAll", "SELECT PushHistory.pushDate, PushHistory.providerInfo, PushHistory.eventId, PushHistory.roomId, PushHistory.sessionId, PushHistory.hasBeenResolved, PushHistory.comment FROM PushHistory ORDER BY pushDate DESC") { cursor ->
    mapper(
      cursor.getLong(0)!!,
      cursor.getString(1)!!,
      cursor.getString(2),
      cursor.getString(3),
      cursor.getString(4),
      cursor.getLong(5)!!,
      cursor.getString(6)
    )
  }

  public fun selectAll(): Query<PushHistory> = selectAll(::PushHistory)

  /**
   * @return The number of rows updated.
   */
  public fun insertPushHistory(PushHistory: PushHistory): QueryResult<Long> {
    val result = driver.execute(-589_394_643, """INSERT INTO PushHistory (pushDate, providerInfo, eventId, roomId, sessionId, hasBeenResolved, comment) VALUES (?, ?, ?, ?, ?, ?, ?)""", 7) {
          var parameterIndex = 0
          bindLong(parameterIndex++, PushHistory.pushDate)
          bindString(parameterIndex++, PushHistory.providerInfo)
          bindString(parameterIndex++, PushHistory.eventId)
          bindString(parameterIndex++, PushHistory.roomId)
          bindString(parameterIndex++, PushHistory.sessionId)
          bindLong(parameterIndex++, PushHistory.hasBeenResolved)
          bindString(parameterIndex++, PushHistory.comment)
        }
    notifyQueries(-589_394_643) { emit ->
      emit("PushHistory")
    }
    return result
  }

  /**
   * @return The number of rows updated.
   */
  public fun removeAll(): QueryResult<Long> {
    val result = driver.execute(-823_508_983, """DELETE FROM PushHistory""", 0)
    notifyQueries(-823_508_983) { emit ->
      emit("PushHistory")
    }
    return result
  }

  /**
   * @return The number of rows updated.
   */
  public fun removeOldest(`value`: Long): QueryResult<Long> {
    val result = driver.execute(97_752_727, """DELETE FROM PushHistory WHERE rowid NOT IN (SELECT rowid FROM PushHistory ORDER BY pushDate DESC LIMIT ?)""", 1) {
          var parameterIndex = 0
          bindLong(parameterIndex++, value)
        }
    notifyQueries(97_752_727) { emit ->
      emit("PushHistory")
    }
    return result
  }
}
