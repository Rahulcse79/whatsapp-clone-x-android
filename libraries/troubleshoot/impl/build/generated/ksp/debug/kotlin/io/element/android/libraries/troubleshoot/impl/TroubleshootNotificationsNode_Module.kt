package io.element.android.libraries.troubleshoot.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(TroubleshootNotificationsNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface TroubleshootNotificationsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(TroubleshootNotificationsNode::class)
  public fun bindTroubleshootNotificationsNodeFactory(factory: TroubleshootNotificationsNode_AssistedFactory): AssistedNodeFactory<*>
}
