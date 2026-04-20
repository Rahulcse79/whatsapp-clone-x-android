package io.element.android.features.preferences.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(PreferencesRootNode::class)
@AssistedFactory
public interface PreferencesRootNode_AssistedFactory : AssistedNodeFactory<PreferencesRootNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): PreferencesRootNode
}
