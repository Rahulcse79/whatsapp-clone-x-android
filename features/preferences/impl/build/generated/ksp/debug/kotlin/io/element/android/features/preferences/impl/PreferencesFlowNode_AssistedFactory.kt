package io.element.android.features.preferences.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(PreferencesFlowNode::class)
@AssistedFactory
public interface PreferencesFlowNode_AssistedFactory : AssistedNodeFactory<PreferencesFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): PreferencesFlowNode
}
