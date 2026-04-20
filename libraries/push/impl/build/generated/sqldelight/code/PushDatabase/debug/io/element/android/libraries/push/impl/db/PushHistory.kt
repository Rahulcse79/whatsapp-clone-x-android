package io.element.android.libraries.push.`impl`.db

import kotlin.Long
import kotlin.String

public data class PushHistory(
  public val pushDate: Long,
  public val providerInfo: String,
  public val eventId: String?,
  public val roomId: String?,
  public val sessionId: String?,
  public val hasBeenResolved: Long,
  public val comment: String?,
)
