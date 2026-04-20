package io.element.android.features.createroom.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(CreateRoomFlowNode::class)
@AssistedFactory
public interface CreateRoomFlowNode_AssistedFactory : AssistedNodeFactory<CreateRoomFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): CreateRoomFlowNode
}
