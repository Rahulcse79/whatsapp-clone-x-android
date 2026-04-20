package io.element.android.features.location.`impl`.share

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(ShareLocationNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface ShareLocationNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ShareLocationNode::class)
  public fun bindShareLocationNodeFactory(factory: ShareLocationNode_AssistedFactory): AssistedNodeFactory<*>
}
