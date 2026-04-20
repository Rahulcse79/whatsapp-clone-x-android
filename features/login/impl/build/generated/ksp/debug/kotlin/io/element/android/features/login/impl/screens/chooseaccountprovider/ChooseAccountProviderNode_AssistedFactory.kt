package io.element.android.features.login.`impl`.screens.chooseaccountprovider

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ChooseAccountProviderNode::class)
@AssistedFactory
public interface ChooseAccountProviderNode_AssistedFactory : AssistedNodeFactory<ChooseAccountProviderNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ChooseAccountProviderNode
}
