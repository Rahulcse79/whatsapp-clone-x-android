package io.element.android.features.securebackup.`impl`.setup

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(SecureBackupSetupNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface SecureBackupSetupNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SecureBackupSetupNode::class)
  public fun bindSecureBackupSetupNodeFactory(factory: SecureBackupSetupNode_AssistedFactory): AssistedNodeFactory<*>
}
