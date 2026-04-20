package io.element.android.features.viewfolder.`impl`.folder

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(ViewFolderNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface ViewFolderNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ViewFolderNode::class)
  public fun bindViewFolderNodeFactory(factory: ViewFolderNode_AssistedFactory): AssistedNodeFactory<*>
}
