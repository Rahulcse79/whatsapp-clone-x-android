package io.element.android.features.securityandprivacy.`impl`.editroomaddress

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(EditRoomAddressNode::class)
@AssistedFactory
public interface EditRoomAddressNode_AssistedFactory : AssistedNodeFactory<EditRoomAddressNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): EditRoomAddressNode
}
