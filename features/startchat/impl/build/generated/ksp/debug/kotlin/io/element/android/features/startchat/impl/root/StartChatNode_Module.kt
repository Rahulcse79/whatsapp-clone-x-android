package io.element.android.features.startchat.`impl`.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(StartChatNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface StartChatNode_Module {
  @Binds
  @IntoMap
  @NodeKey(StartChatNode::class)
  public fun bindStartChatNodeFactory(factory: StartChatNode_AssistedFactory): AssistedNodeFactory<*>
}
