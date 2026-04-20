package io.element.android.features.viewfolder.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ViewFolderFlowNode::class)
@AssistedFactory
public interface ViewFolderFlowNode_AssistedFactory : AssistedNodeFactory<ViewFolderFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ViewFolderFlowNode
}
