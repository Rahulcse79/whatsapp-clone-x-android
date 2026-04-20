package io.element.android.features.lockscreen.`impl`.setup

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(LockScreenSetupFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface LockScreenSetupFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LockScreenSetupFlowNode::class)
  public fun bindLockScreenSetupFlowNodeFactory(factory: LockScreenSetupFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
