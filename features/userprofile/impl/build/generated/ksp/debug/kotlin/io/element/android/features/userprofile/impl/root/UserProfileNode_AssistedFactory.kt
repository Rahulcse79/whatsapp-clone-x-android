package io.element.android.features.userprofile.`impl`.root

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(UserProfileNode::class)
@AssistedFactory
public interface UserProfileNode_AssistedFactory : AssistedNodeFactory<UserProfileNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): UserProfileNode
}
