package io.element.android.features.linknewdevice.`impl`.screens.qrcode

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ShowQrCodeNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ShowQrCodeNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ShowQrCodeNode::class)
  public fun bindShowQrCodeNodeFactory(factory: ShowQrCodeNode_AssistedFactory): AssistedNodeFactory<*>
}
