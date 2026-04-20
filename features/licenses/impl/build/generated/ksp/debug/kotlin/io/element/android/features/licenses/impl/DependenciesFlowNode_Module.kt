package io.element.android.features.licenses.`impl`

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(DependenciesFlowNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface DependenciesFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(DependenciesFlowNode::class)
  public fun bindDependenciesFlowNodeFactory(factory: DependenciesFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
