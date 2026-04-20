package io.element.android.features.login.`impl`.screens.searchaccountprovider

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SearchAccountProviderNode::class)
@AssistedFactory
public interface SearchAccountProviderNode_AssistedFactory : AssistedNodeFactory<SearchAccountProviderNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SearchAccountProviderNode
}
