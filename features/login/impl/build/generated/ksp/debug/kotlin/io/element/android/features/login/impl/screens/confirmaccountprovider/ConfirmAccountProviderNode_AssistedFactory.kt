package io.element.android.features.login.`impl`.screens.confirmaccountprovider

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ConfirmAccountProviderNode::class)
@AssistedFactory
public interface ConfirmAccountProviderNode_AssistedFactory : AssistedNodeFactory<ConfirmAccountProviderNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ConfirmAccountProviderNode
}
