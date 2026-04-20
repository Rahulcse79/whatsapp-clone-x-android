package io.element.android.features.viewfolder.`impl`.`file`

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(ViewFileNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface ViewFileNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ViewFileNode::class)
  public fun bindViewFileNodeFactory(factory: ViewFileNode_AssistedFactory): AssistedNodeFactory<*>
}
