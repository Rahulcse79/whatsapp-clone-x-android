package io.element.android.features.lockscreen.`impl`.settings

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LockScreenSettingsFlowNode::class)
@AssistedFactory
public interface LockScreenSettingsFlowNode_AssistedFactory : AssistedNodeFactory<LockScreenSettingsFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LockScreenSettingsFlowNode
}
