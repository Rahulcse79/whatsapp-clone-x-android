package io.element.android.features.space.`impl`.addroom

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(AddRoomToSpaceNode::class)
@AssistedFactory
public interface AddRoomToSpaceNode_AssistedFactory : AssistedNodeFactory<AddRoomToSpaceNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): AddRoomToSpaceNode
}
