package io.element.android.features.securebackup.`impl`.reset

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ResetIdentityFlowNode::class)
@AssistedFactory
public interface ResetIdentityFlowNode_AssistedFactory : AssistedNodeFactory<ResetIdentityFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ResetIdentityFlowNode
}
