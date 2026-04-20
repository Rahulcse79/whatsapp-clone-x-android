package io.element.android.features.preferences.`impl`.notifications.edit

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(EditDefaultNotificationSettingNode::class)
@AssistedFactory
public interface EditDefaultNotificationSettingNode_AssistedFactory : AssistedNodeFactory<EditDefaultNotificationSettingNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): EditDefaultNotificationSettingNode
}
