package io.element.android.features.linknewdevice.`impl`.screens.desktop

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(DesktopNoticeNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface DesktopNoticeNode_Module {
  @Binds
  @IntoMap
  @NodeKey(DesktopNoticeNode::class)
  public fun bindDesktopNoticeNodeFactory(factory: DesktopNoticeNode_AssistedFactory): AssistedNodeFactory<*>
}
