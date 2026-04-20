package io.element.android.features.login.`impl`.screens.confirmaccountprovider

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(ConfirmAccountProviderNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface ConfirmAccountProviderNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ConfirmAccountProviderNode::class)
  public fun bindConfirmAccountProviderNodeFactory(factory: ConfirmAccountProviderNode_AssistedFactory): AssistedNodeFactory<*>
}
