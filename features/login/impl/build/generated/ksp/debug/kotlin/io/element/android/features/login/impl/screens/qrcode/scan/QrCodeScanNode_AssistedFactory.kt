package io.element.android.features.login.`impl`.screens.qrcode.scan

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(QrCodeScanNode::class)
@AssistedFactory
public interface QrCodeScanNode_AssistedFactory : AssistedNodeFactory<QrCodeScanNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): QrCodeScanNode
}
