package io.element.android.libraries.mediaviewer.`impl`.gallery.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(MediaGalleryFlowNode::class)
@AssistedFactory
public interface MediaGalleryFlowNode_AssistedFactory : AssistedNodeFactory<MediaGalleryFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): MediaGalleryFlowNode
}
