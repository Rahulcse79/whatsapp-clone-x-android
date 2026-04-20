package io.element.android.features.securityandprivacy.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SecurityAndPrivacyNode::class)
@AssistedFactory
public interface SecurityAndPrivacyNode_AssistedFactory : AssistedNodeFactory<SecurityAndPrivacyNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SecurityAndPrivacyNode
}
