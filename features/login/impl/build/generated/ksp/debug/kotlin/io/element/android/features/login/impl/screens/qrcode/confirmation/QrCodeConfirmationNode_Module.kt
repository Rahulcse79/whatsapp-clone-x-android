package io.element.android.features.login.`impl`.screens.qrcode.confirmation

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.login.`impl`.di.QrCodeLoginScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(QrCodeConfirmationNode::class)
@BindingContainer
@ContributesTo(QrCodeLoginScope::class)
public interface QrCodeConfirmationNode_Module {
  @Binds
  @IntoMap
  @NodeKey(QrCodeConfirmationNode::class)
  public fun bindQrCodeConfirmationNodeFactory(factory: QrCodeConfirmationNode_AssistedFactory): AssistedNodeFactory<*>
}
