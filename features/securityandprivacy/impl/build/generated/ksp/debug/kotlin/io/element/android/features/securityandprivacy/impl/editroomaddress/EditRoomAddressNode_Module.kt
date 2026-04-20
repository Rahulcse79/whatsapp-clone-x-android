package io.element.android.features.securityandprivacy.`impl`.editroomaddress

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(EditRoomAddressNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface EditRoomAddressNode_Module {
  @Binds
  @IntoMap
  @NodeKey(EditRoomAddressNode::class)
  public fun bindEditRoomAddressNodeFactory(factory: EditRoomAddressNode_AssistedFactory): AssistedNodeFactory<*>
}
