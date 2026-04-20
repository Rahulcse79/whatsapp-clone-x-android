package io.element.android.features.joinroom.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(JoinRoomFlowNode::class)
@AssistedFactory
public interface JoinRoomFlowNode_AssistedFactory : AssistedNodeFactory<JoinRoomFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): JoinRoomFlowNode
}
