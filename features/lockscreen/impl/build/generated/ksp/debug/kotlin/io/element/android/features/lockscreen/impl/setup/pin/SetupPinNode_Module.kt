package io.element.android.features.lockscreen.`impl`.setup.pin

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(SetupPinNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface SetupPinNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SetupPinNode::class)
  public fun bindSetupPinNodeFactory(factory: SetupPinNode_AssistedFactory): AssistedNodeFactory<*>
}
