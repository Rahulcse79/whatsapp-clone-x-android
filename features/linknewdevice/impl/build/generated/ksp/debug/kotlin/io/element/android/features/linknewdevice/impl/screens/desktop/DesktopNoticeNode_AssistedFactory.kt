package io.element.android.features.linknewdevice.`impl`.screens.desktop

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(DesktopNoticeNode::class)
@AssistedFactory
public interface DesktopNoticeNode_AssistedFactory : AssistedNodeFactory<DesktopNoticeNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): DesktopNoticeNode
}
