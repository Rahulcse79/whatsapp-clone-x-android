package io.element.android.features.securebackup.`impl`.reset

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ResetIdentityFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ResetIdentityFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ResetIdentityFlowNode::class)
  public fun bindResetIdentityFlowNodeFactory(factory: ResetIdentityFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
