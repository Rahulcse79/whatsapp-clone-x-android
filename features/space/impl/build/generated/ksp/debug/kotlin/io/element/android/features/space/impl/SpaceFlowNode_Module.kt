package io.element.android.features.space.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(SpaceFlowNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface SpaceFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SpaceFlowNode::class)
  public fun bindSpaceFlowNodeFactory(factory: SpaceFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
