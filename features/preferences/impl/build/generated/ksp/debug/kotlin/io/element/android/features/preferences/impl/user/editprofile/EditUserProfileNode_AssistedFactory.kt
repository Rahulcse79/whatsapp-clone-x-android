package io.element.android.features.preferences.`impl`.user.editprofile

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(EditUserProfileNode::class)
@AssistedFactory
public interface EditUserProfileNode_AssistedFactory : AssistedNodeFactory<EditUserProfileNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): EditUserProfileNode
}
