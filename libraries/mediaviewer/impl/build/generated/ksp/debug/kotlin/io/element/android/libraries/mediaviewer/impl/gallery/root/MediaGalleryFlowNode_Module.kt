package io.element.android.libraries.mediaviewer.`impl`.gallery.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(MediaGalleryFlowNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface MediaGalleryFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(MediaGalleryFlowNode::class)
  public fun bindMediaGalleryFlowNodeFactory(factory: MediaGalleryFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
