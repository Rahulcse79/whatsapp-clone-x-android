package io.element.android.appnav.loggedin

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LoggedInNode::class)
@AssistedFactory
public interface LoggedInNode_AssistedFactory : AssistedNodeFactory<LoggedInNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LoggedInNode
}
