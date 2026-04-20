package io.element.android.features.preferences.`impl`.developer.appsettings

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(AppDeveloperSettingsNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface AppDeveloperSettingsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(AppDeveloperSettingsNode::class)
  public fun bindAppDeveloperSettingsNodeFactory(factory: AppDeveloperSettingsNode_AssistedFactory): AssistedNodeFactory<*>
}
