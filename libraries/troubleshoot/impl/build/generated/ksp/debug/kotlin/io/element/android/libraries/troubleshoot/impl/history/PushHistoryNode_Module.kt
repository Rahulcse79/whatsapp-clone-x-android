package io.element.android.libraries.troubleshoot.`impl`.history

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(PushHistoryNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface PushHistoryNode_Module {
  @Binds
  @IntoMap
  @NodeKey(PushHistoryNode::class)
  public fun bindPushHistoryNodeFactory(factory: PushHistoryNode_AssistedFactory): AssistedNodeFactory<*>
}
