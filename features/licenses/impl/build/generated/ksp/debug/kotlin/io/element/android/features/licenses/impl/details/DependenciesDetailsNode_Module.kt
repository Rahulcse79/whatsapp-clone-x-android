package io.element.android.features.licenses.`impl`.details

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(DependenciesDetailsNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface DependenciesDetailsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(DependenciesDetailsNode::class)
  public fun bindDependenciesDetailsNodeFactory(factory: DependenciesDetailsNode_AssistedFactory): AssistedNodeFactory<*>
}
