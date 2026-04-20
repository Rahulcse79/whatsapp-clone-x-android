package io.element.android.appnav

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(RootFlowNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface RootFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(RootFlowNode::class)
  public fun bindRootFlowNodeFactory(factory: RootFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
