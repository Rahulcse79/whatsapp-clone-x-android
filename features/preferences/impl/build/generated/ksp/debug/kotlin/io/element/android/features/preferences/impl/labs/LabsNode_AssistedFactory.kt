package io.element.android.features.preferences.`impl`.labs

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LabsNode::class)
@AssistedFactory
public interface LabsNode_AssistedFactory : AssistedNodeFactory<LabsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LabsNode
}
