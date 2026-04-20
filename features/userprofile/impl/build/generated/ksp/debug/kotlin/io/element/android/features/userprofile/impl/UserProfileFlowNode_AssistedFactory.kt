package io.element.android.features.userprofile.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(UserProfileFlowNode::class)
@AssistedFactory
public interface UserProfileFlowNode_AssistedFactory : AssistedNodeFactory<UserProfileFlowNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): UserProfileFlowNode
}
