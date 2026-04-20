package io.element.android.libraries.mediaviewer.`impl`.gallery

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(MediaGalleryNode::class)
@AssistedFactory
public interface MediaGalleryNode_AssistedFactory : AssistedNodeFactory<MediaGalleryNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): MediaGalleryNode
}
