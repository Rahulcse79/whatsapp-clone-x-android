package io.element.android.features.analytics.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(AnalyticsOptInNode::class)
@AssistedFactory
public interface AnalyticsOptInNode_AssistedFactory : AssistedNodeFactory<AnalyticsOptInNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): AnalyticsOptInNode
}
