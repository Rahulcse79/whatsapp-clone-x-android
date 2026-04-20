package io.element.android.features.lockscreen.`impl`.unlock

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(PinUnlockNode::class)
@AssistedFactory
public interface PinUnlockNode_AssistedFactory : AssistedNodeFactory<PinUnlockNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): PinUnlockNode
}
