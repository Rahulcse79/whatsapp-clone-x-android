package io.element.android.features.space.`impl`.leave

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LeaveSpaceNode::class)
@AssistedFactory
public interface LeaveSpaceNode_AssistedFactory : AssistedNodeFactory<LeaveSpaceNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LeaveSpaceNode
}
