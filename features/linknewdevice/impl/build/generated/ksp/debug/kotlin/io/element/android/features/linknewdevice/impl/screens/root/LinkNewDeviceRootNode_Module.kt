package io.element.android.features.linknewdevice.`impl`.screens.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(LinkNewDeviceRootNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface LinkNewDeviceRootNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LinkNewDeviceRootNode::class)
  public fun bindLinkNewDeviceRootNodeFactory(factory: LinkNewDeviceRootNode_AssistedFactory): AssistedNodeFactory<*>
}
