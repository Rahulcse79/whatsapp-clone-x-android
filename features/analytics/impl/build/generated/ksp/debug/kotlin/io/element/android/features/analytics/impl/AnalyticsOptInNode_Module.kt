package io.element.android.features.analytics.`impl`

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(AnalyticsOptInNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface AnalyticsOptInNode_Module {
  @Binds
  @IntoMap
  @NodeKey(AnalyticsOptInNode::class)
  public fun bindAnalyticsOptInNodeFactory(factory: AnalyticsOptInNode_AssistedFactory): AssistedNodeFactory<*>
}
