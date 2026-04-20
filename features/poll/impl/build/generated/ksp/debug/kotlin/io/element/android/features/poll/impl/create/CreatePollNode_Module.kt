package io.element.android.features.poll.`impl`.create

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(CreatePollNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface CreatePollNode_Module {
  @Binds
  @IntoMap
  @NodeKey(CreatePollNode::class)
  public fun bindCreatePollNodeFactory(factory: CreatePollNode_AssistedFactory): AssistedNodeFactory<*>
}
