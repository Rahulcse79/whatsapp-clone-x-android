package io.element.android.features.linknewdevice.`impl`.screens.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LinkNewDeviceRootNode::class)
@AssistedFactory
public interface LinkNewDeviceRootNode_AssistedFactory : AssistedNodeFactory<LinkNewDeviceRootNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LinkNewDeviceRootNode
}
