package io.element.android.features.lockscreen.`impl`.settings

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LockScreenSettingsNode::class)
@AssistedFactory
public interface LockScreenSettingsNode_AssistedFactory : AssistedNodeFactory<LockScreenSettingsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LockScreenSettingsNode
}
