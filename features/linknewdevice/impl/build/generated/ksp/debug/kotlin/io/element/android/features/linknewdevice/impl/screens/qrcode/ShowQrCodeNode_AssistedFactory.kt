package io.element.android.features.linknewdevice.`impl`.screens.qrcode

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ShowQrCodeNode::class)
@AssistedFactory
public interface ShowQrCodeNode_AssistedFactory : AssistedNodeFactory<ShowQrCodeNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ShowQrCodeNode
}
