package io.element.android.features.login.`impl`.screens.qrcode.intro

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.features.login.`impl`.di.QrCodeLoginScope
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(QrCodeIntroNode::class)
@BindingContainer
@ContributesTo(QrCodeLoginScope::class)
public interface QrCodeIntroNode_Module {
  @Binds
  @IntoMap
  @NodeKey(QrCodeIntroNode::class)
  public fun bindQrCodeIntroNodeFactory(factory: QrCodeIntroNode_AssistedFactory): AssistedNodeFactory<*>
}
