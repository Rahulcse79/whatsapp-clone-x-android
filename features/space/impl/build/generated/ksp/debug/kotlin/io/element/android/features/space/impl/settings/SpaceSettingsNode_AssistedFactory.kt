package io.element.android.features.space.`impl`.settings

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SpaceSettingsNode::class)
@AssistedFactory
public interface SpaceSettingsNode_AssistedFactory : AssistedNodeFactory<SpaceSettingsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SpaceSettingsNode
}
