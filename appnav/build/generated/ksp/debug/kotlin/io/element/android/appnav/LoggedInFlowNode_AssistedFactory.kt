package io.element.android.appnav

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LoggedInFlowNode::class)
@AssistedFactory
public interface LoggedInFlowNode_AssistedFactory : AssistedNodeFactory<LoggedInFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LoggedInFlowNode
}
