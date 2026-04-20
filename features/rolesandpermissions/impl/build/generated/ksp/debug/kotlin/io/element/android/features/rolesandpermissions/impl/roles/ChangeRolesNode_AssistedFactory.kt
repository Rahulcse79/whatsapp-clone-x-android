package io.element.android.features.rolesandpermissions.`impl`.roles

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ChangeRolesNode::class)
@AssistedFactory
public interface ChangeRolesNode_AssistedFactory : AssistedNodeFactory<ChangeRolesNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ChangeRolesNode
}
