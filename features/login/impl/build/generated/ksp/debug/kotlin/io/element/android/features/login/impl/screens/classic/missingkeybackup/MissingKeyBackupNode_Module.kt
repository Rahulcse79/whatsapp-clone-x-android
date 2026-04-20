package io.element.android.features.login.`impl`.screens.classic.missingkeybackup

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(MissingKeyBackupNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface MissingKeyBackupNode_Module {
  @Binds
  @IntoMap
  @NodeKey(MissingKeyBackupNode::class)
  public fun bindMissingKeyBackupNodeFactory(factory: MissingKeyBackupNode_AssistedFactory): AssistedNodeFactory<*>
}
