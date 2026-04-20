package io.element.android.features.login.`impl`.screens.classic.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(RootNode::class)
@AssistedFactory
public interface RootNode_AssistedFactory : AssistedNodeFactory<RootNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): RootNode
}
