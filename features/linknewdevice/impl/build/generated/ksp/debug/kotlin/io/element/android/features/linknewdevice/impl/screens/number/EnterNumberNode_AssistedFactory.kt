package io.element.android.features.linknewdevice.`impl`.screens.number

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(EnterNumberNode::class)
@AssistedFactory
public interface EnterNumberNode_AssistedFactory : AssistedNodeFactory<EnterNumberNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): EnterNumberNode
}
