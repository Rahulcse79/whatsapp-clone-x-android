package io.element.android.features.preferences.`impl`.advanced

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(AdvancedSettingsNode::class)
@AssistedFactory
public interface AdvancedSettingsNode_AssistedFactory : AssistedNodeFactory<AdvancedSettingsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): AdvancedSettingsNode
}
