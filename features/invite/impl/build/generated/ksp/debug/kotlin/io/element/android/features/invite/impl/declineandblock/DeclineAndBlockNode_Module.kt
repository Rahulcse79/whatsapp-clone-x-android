package io.element.android.features.invite.`impl`.declineandblock

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(DeclineAndBlockNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface DeclineAndBlockNode_Module {
  @Binds
  @IntoMap
  @NodeKey(DeclineAndBlockNode::class)
  public fun bindDeclineAndBlockNodeFactory(factory: DeclineAndBlockNode_AssistedFactory): AssistedNodeFactory<*>
}
