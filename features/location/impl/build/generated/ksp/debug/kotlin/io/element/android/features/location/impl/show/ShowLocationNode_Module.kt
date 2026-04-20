package io.element.android.features.location.`impl`.show

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(ShowLocationNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface ShowLocationNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ShowLocationNode::class)
  public fun bindShowLocationNodeFactory(factory: ShowLocationNode_AssistedFactory): AssistedNodeFactory<*>
}
