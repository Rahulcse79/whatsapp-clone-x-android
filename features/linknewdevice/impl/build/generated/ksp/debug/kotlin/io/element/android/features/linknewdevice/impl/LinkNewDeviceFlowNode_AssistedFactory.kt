package io.element.android.features.linknewdevice.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LinkNewDeviceFlowNode::class)
@AssistedFactory
public interface LinkNewDeviceFlowNode_AssistedFactory : AssistedNodeFactory<LinkNewDeviceFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LinkNewDeviceFlowNode
}
