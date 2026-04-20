package io.element.android.features.space.`impl`.settings

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.space.`impl`.di.SpaceFlowScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(SpaceSettingsFlowNode::class)
@BindingContainer
@ContributesTo(SpaceFlowScope::class)
public interface SpaceSettingsFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SpaceSettingsFlowNode::class)
  public fun bindSpaceSettingsFlowNodeFactory(factory: SpaceSettingsFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
