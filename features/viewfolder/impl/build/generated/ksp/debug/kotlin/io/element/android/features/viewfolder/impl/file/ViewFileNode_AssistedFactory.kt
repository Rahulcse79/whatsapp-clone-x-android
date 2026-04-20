package io.element.android.features.viewfolder.`impl`.`file`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ViewFileNode::class)
@AssistedFactory
public interface ViewFileNode_AssistedFactory : AssistedNodeFactory<ViewFileNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ViewFileNode
}
