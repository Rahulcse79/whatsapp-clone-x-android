package io.element.android.features.space.`impl`.settings

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.space.`impl`.di.SpaceFlowScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(SpaceSettingsNode::class)
@BindingContainer
@ContributesTo(SpaceFlowScope::class)
public interface SpaceSettingsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SpaceSettingsNode::class)
  public fun bindSpaceSettingsNodeFactory(factory: SpaceSettingsNode_AssistedFactory): AssistedNodeFactory<*>
}
