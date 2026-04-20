package io.element.android.features.securityandprivacy.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SecurityAndPrivacyFlowNode::class)
@AssistedFactory
public interface SecurityAndPrivacyFlowNode_AssistedFactory : AssistedNodeFactory<SecurityAndPrivacyFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SecurityAndPrivacyFlowNode
}
