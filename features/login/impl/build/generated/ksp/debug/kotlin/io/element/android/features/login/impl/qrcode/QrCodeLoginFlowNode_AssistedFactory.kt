package io.element.android.features.login.`impl`.qrcode

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(QrCodeLoginFlowNode::class)
@AssistedFactory
public interface QrCodeLoginFlowNode_AssistedFactory : AssistedNodeFactory<QrCodeLoginFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): QrCodeLoginFlowNode
}
