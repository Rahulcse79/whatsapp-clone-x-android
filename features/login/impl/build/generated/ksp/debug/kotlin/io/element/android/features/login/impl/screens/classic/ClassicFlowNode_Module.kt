package io.element.android.features.login.`impl`.screens.classic

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(ClassicFlowNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface ClassicFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ClassicFlowNode::class)
  public fun bindClassicFlowNodeFactory(factory: ClassicFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
