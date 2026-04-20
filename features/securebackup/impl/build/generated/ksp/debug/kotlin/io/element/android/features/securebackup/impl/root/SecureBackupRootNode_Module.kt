package io.element.android.features.securebackup.`impl`.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(SecureBackupRootNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface SecureBackupRootNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SecureBackupRootNode::class)
  public fun bindSecureBackupRootNodeFactory(factory: SecureBackupRootNode_AssistedFactory): AssistedNodeFactory<*>
}
