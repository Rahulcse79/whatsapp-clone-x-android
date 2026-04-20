package io.element.android.features.login.`impl`.qrcode

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(QrCodeLoginFlowNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface QrCodeLoginFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(QrCodeLoginFlowNode::class)
  public fun bindQrCodeLoginFlowNodeFactory(factory: QrCodeLoginFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
