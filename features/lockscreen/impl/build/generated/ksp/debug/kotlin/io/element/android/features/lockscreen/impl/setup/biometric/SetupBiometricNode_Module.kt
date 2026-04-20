package io.element.android.features.lockscreen.`impl`.setup.biometric

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(SetupBiometricNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface SetupBiometricNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SetupBiometricNode::class)
  public fun bindSetupBiometricNodeFactory(factory: SetupBiometricNode_AssistedFactory): AssistedNodeFactory<*>
}
