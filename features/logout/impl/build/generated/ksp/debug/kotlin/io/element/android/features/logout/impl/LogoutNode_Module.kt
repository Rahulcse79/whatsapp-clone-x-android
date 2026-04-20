package io.element.android.features.logout.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(LogoutNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface LogoutNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LogoutNode::class)
  public fun bindLogoutNodeFactory(factory: LogoutNode_AssistedFactory): AssistedNodeFactory<*>
}
