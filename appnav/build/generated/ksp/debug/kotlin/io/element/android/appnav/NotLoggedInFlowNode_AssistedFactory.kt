package io.element.android.appnav

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(NotLoggedInFlowNode::class)
@AssistedFactory
public interface NotLoggedInFlowNode_AssistedFactory : AssistedNodeFactory<NotLoggedInFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): NotLoggedInFlowNode
}
