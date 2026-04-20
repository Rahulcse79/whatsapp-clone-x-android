package io.element.android.features.securebackup.`impl`.setup

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SecureBackupSetupNode::class)
@AssistedFactory
public interface SecureBackupSetupNode_AssistedFactory : AssistedNodeFactory<SecureBackupSetupNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SecureBackupSetupNode
}
