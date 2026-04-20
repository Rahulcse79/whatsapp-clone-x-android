package io.element.android.features.login.`impl`.screens.changeaccountprovider

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(ChangeAccountProviderNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface ChangeAccountProviderNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ChangeAccountProviderNode::class)
  public fun bindChangeAccountProviderNodeFactory(factory: ChangeAccountProviderNode_AssistedFactory): AssistedNodeFactory<*>
}
