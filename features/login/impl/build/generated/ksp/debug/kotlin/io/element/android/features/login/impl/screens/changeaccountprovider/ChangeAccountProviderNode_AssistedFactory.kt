package io.element.android.features.login.`impl`.screens.changeaccountprovider

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ChangeAccountProviderNode::class)
@AssistedFactory
public interface ChangeAccountProviderNode_AssistedFactory : AssistedNodeFactory<ChangeAccountProviderNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ChangeAccountProviderNode
}
