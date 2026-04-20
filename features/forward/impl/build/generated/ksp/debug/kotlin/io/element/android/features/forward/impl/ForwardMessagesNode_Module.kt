package io.element.android.features.forward.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ForwardMessagesNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ForwardMessagesNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ForwardMessagesNode::class)
  public fun bindForwardMessagesNodeFactory(factory: ForwardMessagesNode_AssistedFactory): AssistedNodeFactory<*>
}
