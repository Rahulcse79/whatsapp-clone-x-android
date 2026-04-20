package io.element.android.features.securebackup.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(SecureBackupFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface SecureBackupFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SecureBackupFlowNode::class)
  public fun bindSecureBackupFlowNodeFactory(factory: SecureBackupFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
