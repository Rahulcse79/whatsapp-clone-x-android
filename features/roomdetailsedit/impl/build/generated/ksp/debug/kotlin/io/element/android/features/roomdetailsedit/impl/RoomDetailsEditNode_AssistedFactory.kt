package io.element.android.features.roomdetailsedit.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(RoomDetailsEditNode::class)
@AssistedFactory
public interface RoomDetailsEditNode_AssistedFactory : AssistedNodeFactory<RoomDetailsEditNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): RoomDetailsEditNode
}
