package io.element.android.features.linknewdevice.`impl`.screens.scan

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ScanQrCodeNode::class)
@AssistedFactory
public interface ScanQrCodeNode_AssistedFactory : AssistedNodeFactory<ScanQrCodeNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ScanQrCodeNode
}
