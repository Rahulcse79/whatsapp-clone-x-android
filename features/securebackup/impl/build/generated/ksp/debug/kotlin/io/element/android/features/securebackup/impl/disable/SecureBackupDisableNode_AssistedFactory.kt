package io.element.android.features.securebackup.`impl`.disable

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SecureBackupDisableNode::class)
@AssistedFactory
public interface SecureBackupDisableNode_AssistedFactory : AssistedNodeFactory<SecureBackupDisableNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SecureBackupDisableNode
}
