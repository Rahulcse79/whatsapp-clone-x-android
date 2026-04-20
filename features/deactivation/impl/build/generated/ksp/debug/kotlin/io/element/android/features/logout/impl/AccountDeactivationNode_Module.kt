package io.element.android.features.logout.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(AccountDeactivationNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface AccountDeactivationNode_Module {
  @Binds
  @IntoMap
  @NodeKey(AccountDeactivationNode::class)
  public fun bindAccountDeactivationNodeFactory(factory: AccountDeactivationNode_AssistedFactory): AssistedNodeFactory<*>
}
