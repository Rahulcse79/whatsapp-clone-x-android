package io.element.android.features.linknewdevice.`impl`.screens.scan

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ScanQrCodeNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ScanQrCodeNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ScanQrCodeNode::class)
  public fun bindScanQrCodeNodeFactory(factory: ScanQrCodeNode_AssistedFactory): AssistedNodeFactory<*>
}
