package io.element.android.features.rolesandpermissions.`impl`.permissions

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(ChangeRoomPermissionsNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface ChangeRoomPermissionsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ChangeRoomPermissionsNode::class)
  public fun bindChangeRoomPermissionsNodeFactory(factory: ChangeRoomPermissionsNode_AssistedFactory): AssistedNodeFactory<*>
}
