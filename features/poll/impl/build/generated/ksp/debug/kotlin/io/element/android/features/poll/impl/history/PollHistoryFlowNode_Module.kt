package io.element.android.features.poll.`impl`.history

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(PollHistoryFlowNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface PollHistoryFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(PollHistoryFlowNode::class)
  public fun bindPollHistoryFlowNodeFactory(factory: PollHistoryFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
