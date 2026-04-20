package io.element.android.features.securityandprivacy.`impl`.manageauthorizedspaces

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ManageAuthorizedSpacesNode::class)
@AssistedFactory
public interface ManageAuthorizedSpacesNode_AssistedFactory : AssistedNodeFactory<ManageAuthorizedSpacesNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ManageAuthorizedSpacesNode
}
