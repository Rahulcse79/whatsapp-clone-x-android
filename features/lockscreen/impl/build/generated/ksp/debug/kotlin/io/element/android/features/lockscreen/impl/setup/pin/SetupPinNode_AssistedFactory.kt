package io.element.android.features.lockscreen.`impl`.setup.pin

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SetupPinNode::class)
@AssistedFactory
public interface SetupPinNode_AssistedFactory : AssistedNodeFactory<SetupPinNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SetupPinNode
}
