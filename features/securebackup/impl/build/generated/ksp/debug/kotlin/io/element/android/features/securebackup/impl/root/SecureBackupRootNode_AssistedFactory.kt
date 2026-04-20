package io.element.android.features.securebackup.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SecureBackupRootNode::class)
@AssistedFactory
public interface SecureBackupRootNode_AssistedFactory : AssistedNodeFactory<SecureBackupRootNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SecureBackupRootNode
}
