package io.element.android.features.knockrequests.`impl`.list

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(KnockRequestsListNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface KnockRequestsListNode_Module {
  @Binds
  @IntoMap
  @NodeKey(KnockRequestsListNode::class)
  public fun bindKnockRequestsListNodeFactory(factory: KnockRequestsListNode_AssistedFactory): AssistedNodeFactory<*>
}
