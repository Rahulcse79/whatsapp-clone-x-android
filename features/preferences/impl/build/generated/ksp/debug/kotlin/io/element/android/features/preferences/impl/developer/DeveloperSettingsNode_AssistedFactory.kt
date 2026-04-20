package io.element.android.features.preferences.`impl`.developer

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(DeveloperSettingsNode::class)
@AssistedFactory
public interface DeveloperSettingsNode_AssistedFactory : AssistedNodeFactory<DeveloperSettingsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): DeveloperSettingsNode
}
