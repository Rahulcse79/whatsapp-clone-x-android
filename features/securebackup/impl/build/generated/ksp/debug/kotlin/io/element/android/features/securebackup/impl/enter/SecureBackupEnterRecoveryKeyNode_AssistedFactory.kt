package io.element.android.features.securebackup.`impl`.enter

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SecureBackupEnterRecoveryKeyNode::class)
@AssistedFactory
public interface SecureBackupEnterRecoveryKeyNode_AssistedFactory : AssistedNodeFactory<SecureBackupEnterRecoveryKeyNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SecureBackupEnterRecoveryKeyNode
}
