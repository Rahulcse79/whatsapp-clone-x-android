package io.element.android.features.startchat.`impl`.joinbyaddress

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(JoinRoomByAddressNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface JoinRoomByAddressNode_Module {
  @Binds
  @IntoMap
  @NodeKey(JoinRoomByAddressNode::class)
  public fun bindJoinRoomByAddressNodeFactory(factory: JoinRoomByAddressNode_AssistedFactory): AssistedNodeFactory<*>
}
