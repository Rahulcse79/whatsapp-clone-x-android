package io.element.android.features.licenses.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(DependenciesFlowNode::class)
@AssistedFactory
public interface DependenciesFlowNode_AssistedFactory : AssistedNodeFactory<DependenciesFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): DependenciesFlowNode
}
