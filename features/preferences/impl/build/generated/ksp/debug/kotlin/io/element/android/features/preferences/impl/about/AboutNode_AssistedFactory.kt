package io.element.android.features.preferences.`impl`.about

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(AboutNode::class)
@AssistedFactory
public interface AboutNode_AssistedFactory : AssistedNodeFactory<AboutNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): AboutNode
}
