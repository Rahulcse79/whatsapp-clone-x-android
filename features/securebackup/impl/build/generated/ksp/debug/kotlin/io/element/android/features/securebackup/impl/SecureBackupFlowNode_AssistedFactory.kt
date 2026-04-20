package io.element.android.features.securebackup.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SecureBackupFlowNode::class)
@AssistedFactory
public interface SecureBackupFlowNode_AssistedFactory : AssistedNodeFactory<SecureBackupFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SecureBackupFlowNode
}
