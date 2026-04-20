package io.element.android.features.share.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ShareNode::class)
@AssistedFactory
public interface ShareNode_AssistedFactory : AssistedNodeFactory<ShareNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ShareNode
}
