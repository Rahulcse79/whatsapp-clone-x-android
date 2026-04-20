package io.element.android.features.rolesandpermissions.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(RolesAndPermissionsFlowNode::class)
@AssistedFactory
public interface RolesAndPermissionsFlowNode_AssistedFactory : AssistedNodeFactory<RolesAndPermissionsFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): RolesAndPermissionsFlowNode
}
