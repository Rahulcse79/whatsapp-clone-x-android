package io.element.android.features.rolesandpermissions.`impl`.roles

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(ChangeRolesNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface ChangeRolesNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ChangeRolesNode::class)
  public fun bindChangeRolesNodeFactory(factory: ChangeRolesNode_AssistedFactory): AssistedNodeFactory<*>
}
