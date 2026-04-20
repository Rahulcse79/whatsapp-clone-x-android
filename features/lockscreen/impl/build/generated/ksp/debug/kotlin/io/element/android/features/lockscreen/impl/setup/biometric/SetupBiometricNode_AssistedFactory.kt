package io.element.android.features.lockscreen.`impl`.setup.biometric

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SetupBiometricNode::class)
@AssistedFactory
public interface SetupBiometricNode_AssistedFactory : AssistedNodeFactory<SetupBiometricNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SetupBiometricNode
}
