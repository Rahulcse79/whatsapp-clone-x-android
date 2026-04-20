package io.element.android.features.preferences.`impl`.blockedusers

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(BlockedUsersNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface BlockedUsersNode_Module {
  @Binds
  @IntoMap
  @NodeKey(BlockedUsersNode::class)
  public fun bindBlockedUsersNodeFactory(factory: BlockedUsersNode_AssistedFactory): AssistedNodeFactory<*>
}
