package io.element.android.features.rolesandpermissions.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(RolesAndPermissionsNode::class)
@AssistedFactory
public interface RolesAndPermissionsNode_AssistedFactory : AssistedNodeFactory<RolesAndPermissionsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): RolesAndPermissionsNode
}
