package io.element.android.features.preferences.`impl`.analytics

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(AnalyticsSettingsNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface AnalyticsSettingsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(AnalyticsSettingsNode::class)
  public fun bindAnalyticsSettingsNodeFactory(factory: AnalyticsSettingsNode_AssistedFactory): AssistedNodeFactory<*>
}
