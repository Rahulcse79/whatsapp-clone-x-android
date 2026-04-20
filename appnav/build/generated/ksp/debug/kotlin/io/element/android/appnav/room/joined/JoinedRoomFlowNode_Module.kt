package io.element.android.appnav.room.joined

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(JoinedRoomFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface JoinedRoomFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(JoinedRoomFlowNode::class)
  public fun bindJoinedRoomFlowNodeFactory(factory: JoinedRoomFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
