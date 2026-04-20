package io.element.android.features.ftue.`impl`.notifications

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(NotificationsOptInNode::class)
@AssistedFactory
public interface NotificationsOptInNode_AssistedFactory : AssistedNodeFactory<NotificationsOptInNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): NotificationsOptInNode
}
