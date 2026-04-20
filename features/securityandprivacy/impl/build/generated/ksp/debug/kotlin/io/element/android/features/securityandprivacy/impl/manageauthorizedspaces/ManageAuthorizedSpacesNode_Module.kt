package io.element.android.features.securityandprivacy.`impl`.manageauthorizedspaces

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(ManageAuthorizedSpacesNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface ManageAuthorizedSpacesNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ManageAuthorizedSpacesNode::class)
  public fun bindManageAuthorizedSpacesNodeFactory(factory: ManageAuthorizedSpacesNode_AssistedFactory): AssistedNodeFactory<*>
}
