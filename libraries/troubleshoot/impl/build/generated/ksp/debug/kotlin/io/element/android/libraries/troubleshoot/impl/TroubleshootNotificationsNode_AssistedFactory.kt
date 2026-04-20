package io.element.android.libraries.troubleshoot.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(TroubleshootNotificationsNode::class)
@AssistedFactory
public interface TroubleshootNotificationsNode_AssistedFactory : AssistedNodeFactory<TroubleshootNotificationsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): TroubleshootNotificationsNode
}
