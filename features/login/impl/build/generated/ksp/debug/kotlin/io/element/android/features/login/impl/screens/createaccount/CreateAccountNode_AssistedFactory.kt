package io.element.android.features.login.`impl`.screens.createaccount

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(CreateAccountNode::class)
@AssistedFactory
public interface CreateAccountNode_AssistedFactory : AssistedNodeFactory<CreateAccountNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): CreateAccountNode
}
