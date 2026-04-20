package io.element.android.features.linknewdevice.`impl`.screens.error

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ErrorNode::class)
@AssistedFactory
public interface ErrorNode_AssistedFactory : AssistedNodeFactory<ErrorNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ErrorNode
}
