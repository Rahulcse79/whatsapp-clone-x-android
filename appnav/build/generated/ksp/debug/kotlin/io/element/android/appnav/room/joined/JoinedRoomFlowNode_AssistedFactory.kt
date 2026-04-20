package io.element.android.appnav.room.joined

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(JoinedRoomFlowNode::class)
@AssistedFactory
public interface JoinedRoomFlowNode_AssistedFactory : AssistedNodeFactory<JoinedRoomFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): JoinedRoomFlowNode
}
