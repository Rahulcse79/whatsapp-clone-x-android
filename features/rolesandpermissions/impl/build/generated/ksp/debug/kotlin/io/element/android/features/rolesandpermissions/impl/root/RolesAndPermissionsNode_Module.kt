package io.element.android.features.rolesandpermissions.`impl`.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(RolesAndPermissionsNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface RolesAndPermissionsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(RolesAndPermissionsNode::class)
  public fun bindRolesAndPermissionsNodeFactory(factory: RolesAndPermissionsNode_AssistedFactory): AssistedNodeFactory<*>
}
