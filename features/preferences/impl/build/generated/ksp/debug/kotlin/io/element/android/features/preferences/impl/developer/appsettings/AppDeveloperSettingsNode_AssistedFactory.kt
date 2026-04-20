package io.element.android.features.preferences.`impl`.developer.appsettings

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(AppDeveloperSettingsNode::class)
@AssistedFactory
public interface AppDeveloperSettingsNode_AssistedFactory : AssistedNodeFactory<AppDeveloperSettingsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): AppDeveloperSettingsNode
}
