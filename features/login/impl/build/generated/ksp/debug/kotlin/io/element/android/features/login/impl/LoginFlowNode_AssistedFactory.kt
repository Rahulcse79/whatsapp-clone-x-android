package io.element.android.features.login.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LoginFlowNode::class)
@AssistedFactory
public interface LoginFlowNode_AssistedFactory : AssistedNodeFactory<LoginFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LoginFlowNode
}
