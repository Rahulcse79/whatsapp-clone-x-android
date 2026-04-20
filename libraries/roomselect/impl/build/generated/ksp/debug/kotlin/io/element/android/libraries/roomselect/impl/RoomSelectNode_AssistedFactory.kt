package io.element.android.libraries.roomselect.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(RoomSelectNode::class)
@AssistedFactory
public interface RoomSelectNode_AssistedFactory : AssistedNodeFactory<RoomSelectNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): RoomSelectNode
}
