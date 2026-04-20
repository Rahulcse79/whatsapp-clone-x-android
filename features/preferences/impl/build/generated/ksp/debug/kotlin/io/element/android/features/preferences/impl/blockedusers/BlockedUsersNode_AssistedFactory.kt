package io.element.android.features.preferences.`impl`.blockedusers

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(BlockedUsersNode::class)
@AssistedFactory
public interface BlockedUsersNode_AssistedFactory : AssistedNodeFactory<BlockedUsersNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): BlockedUsersNode
}
