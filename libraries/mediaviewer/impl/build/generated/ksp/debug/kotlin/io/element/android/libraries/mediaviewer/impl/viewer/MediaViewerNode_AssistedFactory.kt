package io.element.android.libraries.mediaviewer.`impl`.viewer

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(MediaViewerNode::class)
@AssistedFactory
public interface MediaViewerNode_AssistedFactory : AssistedNodeFactory<MediaViewerNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): MediaViewerNode
}
