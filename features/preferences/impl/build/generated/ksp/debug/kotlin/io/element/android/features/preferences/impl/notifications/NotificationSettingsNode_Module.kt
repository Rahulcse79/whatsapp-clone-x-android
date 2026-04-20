package io.element.android.features.preferences.`impl`.notifications

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(NotificationSettingsNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface NotificationSettingsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(NotificationSettingsNode::class)
  public fun bindNotificationSettingsNodeFactory(factory: NotificationSettingsNode_AssistedFactory): AssistedNodeFactory<*>
}
