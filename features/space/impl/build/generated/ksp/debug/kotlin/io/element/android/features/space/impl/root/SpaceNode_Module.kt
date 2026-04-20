package io.element.android.features.space.`impl`.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.space.`impl`.di.SpaceFlowScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(SpaceNode::class)
@BindingContainer
@ContributesTo(SpaceFlowScope::class)
public interface SpaceNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SpaceNode::class)
  public fun bindSpaceNodeFactory(factory: SpaceNode_AssistedFactory): AssistedNodeFactory<*>
}
