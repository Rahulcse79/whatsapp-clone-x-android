package io.element.android.libraries.push.`impl`

import app.cash.sqldelight.Transacter
import app.cash.sqldelight.db.QueryResult
import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.db.SqlSchema
import io.element.android.libraries.push.`impl`.`impl`.newInstance
import io.element.android.libraries.push.`impl`.`impl`.schema
import io.element.android.libraries.push.`impl`.db.PushHistoryQueries
import io.element.android.libraries.push.`impl`.db.PushRequestQueries
import kotlin.Unit

public interface PushDatabase : Transacter {
  public val pushHistoryQueries: PushHistoryQueries

  public val pushRequestQueries: PushRequestQueries

  public companion object {
    public val Schema: SqlSchema<QueryResult.Value<Unit>>
      get() = PushDatabase::class.schema

    public operator fun invoke(driver: SqlDriver): PushDatabase = PushDatabase::class.newInstance(driver)
  }
}
