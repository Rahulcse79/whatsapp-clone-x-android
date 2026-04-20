package io.element.android.features.securebackup.`impl`.disable

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(SecureBackupDisableNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface SecureBackupDisableNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SecureBackupDisableNode::class)
  public fun bindSecureBackupDisableNodeFactory(factory: SecureBackupDisableNode_AssistedFactory): AssistedNodeFactory<*>
}
