package io.element.android.features.ftue.`impl`.notifications

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(NotificationsOptInNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface NotificationsOptInNode_Module {
  @Binds
  @IntoMap
  @NodeKey(NotificationsOptInNode::class)
  public fun bindNotificationsOptInNodeFactory(factory: NotificationsOptInNode_AssistedFactory): AssistedNodeFactory<*>
}
