package io.element.android.features.rolesandpermissions.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(RolesAndPermissionsFlowNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface RolesAndPermissionsFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(RolesAndPermissionsFlowNode::class)
  public fun bindRolesAndPermissionsFlowNodeFactory(factory: RolesAndPermissionsFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
