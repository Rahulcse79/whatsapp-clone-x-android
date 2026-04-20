package io.element.android.features.startchat.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(StartChatFlowNode::class)
@AssistedFactory
public interface StartChatFlowNode_AssistedFactory : AssistedNodeFactory<StartChatFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): StartChatFlowNode
}
