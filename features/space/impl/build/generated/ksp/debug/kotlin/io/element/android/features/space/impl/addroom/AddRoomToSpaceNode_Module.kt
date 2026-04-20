package io.element.android.features.space.`impl`.addroom

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.space.`impl`.di.SpaceFlowScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(AddRoomToSpaceNode::class)
@BindingContainer
@ContributesTo(SpaceFlowScope::class)
public interface AddRoomToSpaceNode_Module {
  @Binds
  @IntoMap
  @NodeKey(AddRoomToSpaceNode::class)
  public fun bindAddRoomToSpaceNodeFactory(factory: AddRoomToSpaceNode_AssistedFactory): AssistedNodeFactory<*>
}
