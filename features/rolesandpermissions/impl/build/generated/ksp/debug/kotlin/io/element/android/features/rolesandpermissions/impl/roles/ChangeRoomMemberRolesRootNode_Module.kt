package io.element.android.features.rolesandpermissions.`impl`.roles

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ChangeRoomMemberRolesRootNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ChangeRoomMemberRolesRootNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ChangeRoomMemberRolesRootNode::class)
  public fun bindChangeRoomMemberRolesRootNodeFactory(factory: ChangeRoomMemberRolesRootNode_AssistedFactory): AssistedNodeFactory<*>
}
