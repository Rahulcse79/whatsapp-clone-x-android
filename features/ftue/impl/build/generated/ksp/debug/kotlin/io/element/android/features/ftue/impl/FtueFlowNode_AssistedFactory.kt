package io.element.android.features.ftue.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(FtueFlowNode::class)
@AssistedFactory
public interface FtueFlowNode_AssistedFactory : AssistedNodeFactory<FtueFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): FtueFlowNode
}
