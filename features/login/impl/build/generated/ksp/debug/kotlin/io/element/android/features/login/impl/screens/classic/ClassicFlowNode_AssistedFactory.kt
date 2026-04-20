package io.element.android.features.login.`impl`.screens.classic

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ClassicFlowNode::class)
@AssistedFactory
public interface ClassicFlowNode_AssistedFactory : AssistedNodeFactory<ClassicFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ClassicFlowNode
}
