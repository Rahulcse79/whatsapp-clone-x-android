package io.element.android.features.roomdirectory.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(RoomDirectoryNode::class)
@AssistedFactory
public interface RoomDirectoryNode_AssistedFactory : AssistedNodeFactory<RoomDirectoryNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): RoomDirectoryNode
}
