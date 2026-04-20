package io.element.android.features.login.`impl`.screens.classic.loginwithclassic

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LoginWithClassicNode::class)
@AssistedFactory
public interface LoginWithClassicNode_AssistedFactory : AssistedNodeFactory<LoginWithClassicNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LoginWithClassicNode
}
