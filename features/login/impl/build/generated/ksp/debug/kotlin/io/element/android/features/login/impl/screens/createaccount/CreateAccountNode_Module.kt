package io.element.android.features.login.`impl`.screens.createaccount

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(CreateAccountNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface CreateAccountNode_Module {
  @Binds
  @IntoMap
  @NodeKey(CreateAccountNode::class)
  public fun bindCreateAccountNodeFactory(factory: CreateAccountNode_AssistedFactory): AssistedNodeFactory<*>
}
