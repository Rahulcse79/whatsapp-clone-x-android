package io.element.android.features.login.`impl`.screens.classic.root

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(RootNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface RootNode_Module {
  @Binds
  @IntoMap
  @NodeKey(RootNode::class)
  public fun bindRootNodeFactory(factory: RootNode_AssistedFactory): AssistedNodeFactory<*>
}
