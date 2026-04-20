package io.element.android.features.licenses.`impl`.list

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(DependencyLicensesListNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface DependencyLicensesListNode_Module {
  @Binds
  @IntoMap
  @NodeKey(DependencyLicensesListNode::class)
  public fun bindDependencyLicensesListNodeFactory(factory: DependencyLicensesListNode_AssistedFactory): AssistedNodeFactory<*>
}
