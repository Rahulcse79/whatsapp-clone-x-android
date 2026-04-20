package io.element.android.features.lockscreen.`impl`.settings

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(LockScreenSettingsFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface LockScreenSettingsFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LockScreenSettingsFlowNode::class)
  public fun bindLockScreenSettingsFlowNodeFactory(factory: LockScreenSettingsFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
