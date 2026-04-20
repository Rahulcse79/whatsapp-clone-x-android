package io.element.android.features.roomaliasresolver.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(RoomAliasResolverNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface RoomAliasResolverNode_Module {
  @Binds
  @IntoMap
  @NodeKey(RoomAliasResolverNode::class)
  public fun bindRoomAliasResolverNodeFactory(factory: RoomAliasResolverNode_AssistedFactory): AssistedNodeFactory<*>
}
