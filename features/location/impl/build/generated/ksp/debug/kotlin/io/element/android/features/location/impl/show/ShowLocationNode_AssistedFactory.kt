package io.element.android.features.location.`impl`.show

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ShowLocationNode::class)
@AssistedFactory
public interface ShowLocationNode_AssistedFactory : AssistedNodeFactory<ShowLocationNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ShowLocationNode
}
