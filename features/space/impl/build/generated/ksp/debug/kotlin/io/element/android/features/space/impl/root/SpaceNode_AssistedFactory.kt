package io.element.android.features.space.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SpaceNode::class)
@AssistedFactory
public interface SpaceNode_AssistedFactory : AssistedNodeFactory<SpaceNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SpaceNode
}
