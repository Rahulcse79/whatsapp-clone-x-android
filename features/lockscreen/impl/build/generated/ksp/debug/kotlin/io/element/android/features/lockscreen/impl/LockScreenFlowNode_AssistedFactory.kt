package io.element.android.features.lockscreen.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LockScreenFlowNode::class)
@AssistedFactory
public interface LockScreenFlowNode_AssistedFactory : AssistedNodeFactory<LockScreenFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LockScreenFlowNode
}
