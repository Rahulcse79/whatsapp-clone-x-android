package io.element.android.features.securebackup.`impl`.reset.password

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ResetIdentityPasswordNode::class)
@AssistedFactory
public interface ResetIdentityPasswordNode_AssistedFactory : AssistedNodeFactory<ResetIdentityPasswordNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ResetIdentityPasswordNode
}
