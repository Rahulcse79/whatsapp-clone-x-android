package io.element.android.libraries.mediaviewer.`impl`.viewer

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(MediaViewerNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface MediaViewerNode_Module {
  @Binds
  @IntoMap
  @NodeKey(MediaViewerNode::class)
  public fun bindMediaViewerNodeFactory(factory: MediaViewerNode_AssistedFactory): AssistedNodeFactory<*>
}
