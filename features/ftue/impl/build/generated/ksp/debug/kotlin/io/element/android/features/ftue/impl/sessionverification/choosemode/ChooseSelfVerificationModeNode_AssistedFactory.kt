package io.element.android.features.ftue.`impl`.sessionverification.choosemode

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ChooseSelfVerificationModeNode::class)
@AssistedFactory
public interface ChooseSelfVerificationModeNode_AssistedFactory : AssistedNodeFactory<ChooseSelfVerificationModeNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ChooseSelfVerificationModeNode
}
