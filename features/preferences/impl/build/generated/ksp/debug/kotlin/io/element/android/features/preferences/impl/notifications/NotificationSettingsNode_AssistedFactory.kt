package io.element.android.features.preferences.`impl`.notifications

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(NotificationSettingsNode::class)
@AssistedFactory
public interface NotificationSettingsNode_AssistedFactory : AssistedNodeFactory<NotificationSettingsNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): NotificationSettingsNode
}
