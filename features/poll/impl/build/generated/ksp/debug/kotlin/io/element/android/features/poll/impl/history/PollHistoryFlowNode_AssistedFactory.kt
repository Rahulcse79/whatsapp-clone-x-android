package io.element.android.features.poll.`impl`.history

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(PollHistoryFlowNode::class)
@AssistedFactory
public interface PollHistoryFlowNode_AssistedFactory : AssistedNodeFactory<PollHistoryFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): PollHistoryFlowNode
}
