package io.element.android.libraries.sessionstorage.`impl`

import app.cash.sqldelight.Transacter
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import io.element.android.libraries.matrix.session.SessionDataQueries
import io.element.android.libraries.sessionstorage.`impl`.`impl`.newInstance
import io.element.android.libraries.sessionstorage.`impl`.`impl`.schema
import kotlin.Unit

public interface SessionDatabase : Transacter {
  public val sessionDataQueries: SessionDataQueries

  public companion object {
    public val Schema: SqlSchema<QueryResult.Value<Unit>>
      get() = SessionDatabase::class.schema

    public operator fun invoke(driver: SqlDriver): SessionDatabase = SessionDatabase::class.newInstance(driver)
  }
}
