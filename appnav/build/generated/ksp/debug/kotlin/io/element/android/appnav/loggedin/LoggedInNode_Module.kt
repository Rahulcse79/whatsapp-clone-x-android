package io.element.android.appnav.loggedin

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(LoggedInNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface LoggedInNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LoggedInNode::class)
  public fun bindLoggedInNodeFactory(factory: LoggedInNode_AssistedFactory): AssistedNodeFactory<*>
}
