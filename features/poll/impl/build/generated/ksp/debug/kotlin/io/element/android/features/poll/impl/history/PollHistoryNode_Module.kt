package io.element.android.features.poll.`impl`.history

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(PollHistoryNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface PollHistoryNode_Module {
  @Binds
  @IntoMap
  @NodeKey(PollHistoryNode::class)
  public fun bindPollHistoryNodeFactory(factory: PollHistoryNode_AssistedFactory): AssistedNodeFactory<*>
}
