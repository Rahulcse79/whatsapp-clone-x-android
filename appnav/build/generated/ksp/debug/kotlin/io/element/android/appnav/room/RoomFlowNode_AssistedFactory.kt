package io.element.android.appnav.room

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(RoomFlowNode::class)
@AssistedFactory
public interface RoomFlowNode_AssistedFactory : AssistedNodeFactory<RoomFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): RoomFlowNode
}
