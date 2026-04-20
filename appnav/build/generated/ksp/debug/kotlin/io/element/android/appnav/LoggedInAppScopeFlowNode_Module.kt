package io.element.android.appnav

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(LoggedInAppScopeFlowNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface LoggedInAppScopeFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LoggedInAppScopeFlowNode::class)
  public fun bindLoggedInAppScopeFlowNodeFactory(factory: LoggedInAppScopeFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
