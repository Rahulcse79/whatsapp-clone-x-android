package io.element.android.features.logout.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(AccountDeactivationNode::class)
@AssistedFactory
public interface AccountDeactivationNode_AssistedFactory : AssistedNodeFactory<AccountDeactivationNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): AccountDeactivationNode
}
