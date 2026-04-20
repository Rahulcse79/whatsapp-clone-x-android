package io.element.android.features.viewfolder.`impl`.root

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(ViewFolderFlowNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface ViewFolderFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ViewFolderFlowNode::class)
  public fun bindViewFolderFlowNodeFactory(factory: ViewFolderFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
