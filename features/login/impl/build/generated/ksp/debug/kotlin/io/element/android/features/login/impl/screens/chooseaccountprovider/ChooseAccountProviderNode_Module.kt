package io.element.android.features.login.`impl`.screens.chooseaccountprovider

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(ChooseAccountProviderNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface ChooseAccountProviderNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ChooseAccountProviderNode::class)
  public fun bindChooseAccountProviderNodeFactory(factory: ChooseAccountProviderNode_AssistedFactory): AssistedNodeFactory<*>
}
