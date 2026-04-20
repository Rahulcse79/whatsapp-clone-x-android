package io.element.android.features.location.`impl`.share

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ShareLocationNode::class)
@AssistedFactory
public interface ShareLocationNode_AssistedFactory : AssistedNodeFactory<ShareLocationNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ShareLocationNode
}
