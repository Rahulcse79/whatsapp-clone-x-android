package io.element.android.libraries.troubleshoot.`impl`.history

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(PushHistoryNode::class)
@AssistedFactory
public interface PushHistoryNode_AssistedFactory : AssistedNodeFactory<PushHistoryNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): PushHistoryNode
}
