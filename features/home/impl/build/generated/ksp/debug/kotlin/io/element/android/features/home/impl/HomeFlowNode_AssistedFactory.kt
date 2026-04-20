package io.element.android.features.home.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(HomeFlowNode::class)
@AssistedFactory
public interface HomeFlowNode_AssistedFactory : AssistedNodeFactory<HomeFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): HomeFlowNode
}
