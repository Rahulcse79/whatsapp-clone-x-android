package io.element.android.libraries.matrix.session

import kotlin.Long
import kotlin.String

public data class SessionData(
  public val userId: String,
  public val deviceId: String,
  public val accessToken: String,
  public val refreshToken: String?,
  public val homeserverUrl: String,
  public val loginTimestamp: Long?,
  public val oidcData: String?,
  public val isTokenValid: Long,
  public val loginType: String?,
  public val passphrase: String?,
  public val sessionPath: String,
  public val cachePath: String,
  public val position: Long,
  public val lastUsageIndex: Long,
  public val userDisplayName: String?,
  public val userAvatarUrl: String?,
)
