package io.element.android.features.preferences.`impl`.developer

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(DeveloperSettingsNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface DeveloperSettingsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(DeveloperSettingsNode::class)
  public fun bindDeveloperSettingsNodeFactory(factory: DeveloperSettingsNode_AssistedFactory): AssistedNodeFactory<*>
}
