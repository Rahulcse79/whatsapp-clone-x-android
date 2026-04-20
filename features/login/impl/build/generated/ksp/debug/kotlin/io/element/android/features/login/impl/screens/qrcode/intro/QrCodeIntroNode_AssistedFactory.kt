package io.element.android.features.login.`impl`.screens.qrcode.intro

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(QrCodeIntroNode::class)
@AssistedFactory
public interface QrCodeIntroNode_AssistedFactory : AssistedNodeFactory<QrCodeIntroNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): QrCodeIntroNode
}
