package io.element.android.features.rolesandpermissions.`impl`.permissions

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ChangeRoomPermissionsNode::class)
@AssistedFactory
public interface ChangeRoomPermissionsNode_AssistedFactory : AssistedNodeFactory<ChangeRoomPermissionsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ChangeRoomPermissionsNode
}
