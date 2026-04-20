package io.element.android.features.ftue.`impl`.sessionverification

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(FtueSessionVerificationFlowNode::class)
@AssistedFactory
public interface FtueSessionVerificationFlowNode_AssistedFactory : AssistedNodeFactory<FtueSessionVerificationFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): FtueSessionVerificationFlowNode
}
