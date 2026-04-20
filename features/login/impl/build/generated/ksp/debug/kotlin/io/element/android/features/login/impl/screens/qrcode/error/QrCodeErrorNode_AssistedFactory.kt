package io.element.android.features.login.`impl`.screens.qrcode.error

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(QrCodeErrorNode::class)
@AssistedFactory
public interface QrCodeErrorNode_AssistedFactory : AssistedNodeFactory<QrCodeErrorNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): QrCodeErrorNode
}
