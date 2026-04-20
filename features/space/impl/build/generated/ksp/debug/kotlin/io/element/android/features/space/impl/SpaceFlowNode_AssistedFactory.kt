package io.element.android.features.space.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SpaceFlowNode::class)
@AssistedFactory
public interface SpaceFlowNode_AssistedFactory : AssistedNodeFactory<SpaceFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SpaceFlowNode
}
