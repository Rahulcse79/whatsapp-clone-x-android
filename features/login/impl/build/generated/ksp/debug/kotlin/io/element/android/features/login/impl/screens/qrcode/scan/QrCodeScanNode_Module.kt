package io.element.android.features.login.`impl`.screens.qrcode.scan

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.login.`impl`.di.QrCodeLoginScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(QrCodeScanNode::class)
@BindingContainer
@ContributesTo(QrCodeLoginScope::class)
public interface QrCodeScanNode_Module {
  @Binds
  @IntoMap
  @NodeKey(QrCodeScanNode::class)
  public fun bindQrCodeScanNodeFactory(factory: QrCodeScanNode_AssistedFactory): AssistedNodeFactory<*>
}
