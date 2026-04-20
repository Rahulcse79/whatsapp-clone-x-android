package io.element.android.features.login.`impl`.screens.classic.missingkeybackup

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(MissingKeyBackupNode::class)
@AssistedFactory
public interface MissingKeyBackupNode_AssistedFactory : AssistedNodeFactory<MissingKeyBackupNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): MissingKeyBackupNode
}
