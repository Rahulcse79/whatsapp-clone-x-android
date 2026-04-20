package io.element.android.features.rageshake.`impl`.bugreport

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(BugReportNode::class)
@AssistedFactory
public interface BugReportNode_AssistedFactory : AssistedNodeFactory<BugReportNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): BugReportNode
}
