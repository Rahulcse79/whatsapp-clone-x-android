package io.element.android.features.linknewdevice.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(LinkNewDeviceFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface LinkNewDeviceFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LinkNewDeviceFlowNode::class)
  public fun bindLinkNewDeviceFlowNodeFactory(factory: LinkNewDeviceFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
