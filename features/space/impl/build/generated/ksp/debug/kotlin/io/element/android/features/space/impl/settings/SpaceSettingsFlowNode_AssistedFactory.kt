package io.element.android.features.space.`impl`.settings

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SpaceSettingsFlowNode::class)
@AssistedFactory
public interface SpaceSettingsFlowNode_AssistedFactory : AssistedNodeFactory<SpaceSettingsFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SpaceSettingsFlowNode
}
