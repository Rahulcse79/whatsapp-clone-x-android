package io.element.android.features.login.`impl`

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(LoginFlowNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface LoginFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LoginFlowNode::class)
  public fun bindLoginFlowNodeFactory(factory: LoginFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
