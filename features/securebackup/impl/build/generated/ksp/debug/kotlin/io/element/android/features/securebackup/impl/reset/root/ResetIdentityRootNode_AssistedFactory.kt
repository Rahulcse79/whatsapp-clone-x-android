package io.element.android.features.securebackup.`impl`.reset.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ResetIdentityRootNode::class)
@AssistedFactory
public interface ResetIdentityRootNode_AssistedFactory : AssistedNodeFactory<ResetIdentityRootNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ResetIdentityRootNode
}
