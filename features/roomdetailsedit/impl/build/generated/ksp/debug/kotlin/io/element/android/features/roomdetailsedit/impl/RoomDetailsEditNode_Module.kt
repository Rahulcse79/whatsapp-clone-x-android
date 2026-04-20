package io.element.android.features.roomdetailsedit.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(RoomDetailsEditNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface RoomDetailsEditNode_Module {
  @Binds
  @IntoMap
  @NodeKey(RoomDetailsEditNode::class)
  public fun bindRoomDetailsEditNodeFactory(factory: RoomDetailsEditNode_AssistedFactory): AssistedNodeFactory<*>
}
