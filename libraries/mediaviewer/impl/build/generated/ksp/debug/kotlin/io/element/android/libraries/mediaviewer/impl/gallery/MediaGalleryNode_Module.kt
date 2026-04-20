package io.element.android.libraries.mediaviewer.`impl`.gallery

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(MediaGalleryNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface MediaGalleryNode_Module {
  @Binds
  @IntoMap
  @NodeKey(MediaGalleryNode::class)
  public fun bindMediaGalleryNodeFactory(factory: MediaGalleryNode_AssistedFactory): AssistedNodeFactory<*>
}
