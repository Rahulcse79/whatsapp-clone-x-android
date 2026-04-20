package io.element.android.features.startchat.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(StartChatNode::class)
@AssistedFactory
public interface StartChatNode_AssistedFactory : AssistedNodeFactory<StartChatNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): StartChatNode
}
