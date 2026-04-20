package io.element.android.features.space.`impl`.leave

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.space.`impl`.di.SpaceFlowScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(LeaveSpaceNode::class)
@BindingContainer
@ContributesTo(SpaceFlowScope::class)
public interface LeaveSpaceNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LeaveSpaceNode::class)
  public fun bindLeaveSpaceNodeFactory(factory: LeaveSpaceNode_AssistedFactory): AssistedNodeFactory<*>
}
