package io.element.android.appnav.room

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(RoomFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface RoomFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(RoomFlowNode::class)
  public fun bindRoomFlowNodeFactory(factory: RoomFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
