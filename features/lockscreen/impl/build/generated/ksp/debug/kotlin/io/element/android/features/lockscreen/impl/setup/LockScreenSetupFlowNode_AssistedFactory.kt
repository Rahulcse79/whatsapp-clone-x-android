package io.element.android.features.lockscreen.`impl`.setup

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LockScreenSetupFlowNode::class)
@AssistedFactory
public interface LockScreenSetupFlowNode_AssistedFactory : AssistedNodeFactory<LockScreenSetupFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LockScreenSetupFlowNode
}
