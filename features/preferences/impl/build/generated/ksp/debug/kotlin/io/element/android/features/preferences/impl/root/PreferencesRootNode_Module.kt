package io.element.android.features.preferences.`impl`.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(PreferencesRootNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface PreferencesRootNode_Module {
  @Binds
  @IntoMap
  @NodeKey(PreferencesRootNode::class)
  public fun bindPreferencesRootNodeFactory(factory: PreferencesRootNode_AssistedFactory): AssistedNodeFactory<*>
}
