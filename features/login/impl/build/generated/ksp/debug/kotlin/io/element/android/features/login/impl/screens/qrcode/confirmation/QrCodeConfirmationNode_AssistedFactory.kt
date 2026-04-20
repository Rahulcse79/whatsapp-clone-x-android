package io.element.android.features.login.`impl`.screens.qrcode.confirmation

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(QrCodeConfirmationNode::class)
@AssistedFactory
public interface QrCodeConfirmationNode_AssistedFactory : AssistedNodeFactory<QrCodeConfirmationNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): QrCodeConfirmationNode
}
