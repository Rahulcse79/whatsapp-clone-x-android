package io.element.android.features.preferences.`impl`.analytics

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(AnalyticsSettingsNode::class)
@AssistedFactory
public interface AnalyticsSettingsNode_AssistedFactory : AssistedNodeFactory<AnalyticsSettingsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): AnalyticsSettingsNode
}
