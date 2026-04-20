package io.element.android.features.reportroom.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ReportRoomNode::class)
@AssistedFactory
public interface ReportRoomNode_AssistedFactory : AssistedNodeFactory<ReportRoomNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ReportRoomNode
}
