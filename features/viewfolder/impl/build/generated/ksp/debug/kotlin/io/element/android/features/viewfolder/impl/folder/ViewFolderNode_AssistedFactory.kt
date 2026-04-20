package io.element.android.features.viewfolder.`impl`.folder

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ViewFolderNode::class)
@AssistedFactory
public interface ViewFolderNode_AssistedFactory : AssistedNodeFactory<ViewFolderNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ViewFolderNode
}
