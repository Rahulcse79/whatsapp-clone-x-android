package io.element.android.features.preferences.`impl`.about

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(AboutNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface AboutNode_Module {
  @Binds
  @IntoMap
  @NodeKey(AboutNode::class)
  public fun bindAboutNodeFactory(factory: AboutNode_AssistedFactory): AssistedNodeFactory<*>
}
