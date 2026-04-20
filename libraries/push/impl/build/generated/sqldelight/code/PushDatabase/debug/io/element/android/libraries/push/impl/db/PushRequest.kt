package io.element.android.libraries.push.`impl`.db

import kotlin.Long
import kotlin.String

public data class PushRequest(
  public val pushDate: Long,
  public val providerInfo: String,
  public val eventId: String,
  public val roomId: String,
  public val sessionId: String,
  public val status: Long,
  public val retries: Long,
)
