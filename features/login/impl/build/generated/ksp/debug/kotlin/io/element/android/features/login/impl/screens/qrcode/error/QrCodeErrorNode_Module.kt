package io.element.android.features.login.`impl`.screens.qrcode.error

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.login.`impl`.di.QrCodeLoginScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(QrCodeErrorNode::class)
@BindingContainer
@ContributesTo(QrCodeLoginScope::class)
public interface QrCodeErrorNode_Module {
  @Binds
  @IntoMap
  @NodeKey(QrCodeErrorNode::class)
  public fun bindQrCodeErrorNodeFactory(factory: QrCodeErrorNode_AssistedFactory): AssistedNodeFactory<*>
}
