package io.element.android.features.login.`impl`.screens.loginpassword

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(LoginPasswordNode::class)
@AssistedFactory
public interface LoginPasswordNode_AssistedFactory : AssistedNodeFactory<LoginPasswordNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): LoginPasswordNode
}
