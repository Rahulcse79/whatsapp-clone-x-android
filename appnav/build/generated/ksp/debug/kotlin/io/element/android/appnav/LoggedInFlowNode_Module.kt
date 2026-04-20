package io.element.android.appnav

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(LoggedInFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface LoggedInFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LoggedInFlowNode::class)
  public fun bindLoggedInFlowNodeFactory(factory: LoggedInFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
