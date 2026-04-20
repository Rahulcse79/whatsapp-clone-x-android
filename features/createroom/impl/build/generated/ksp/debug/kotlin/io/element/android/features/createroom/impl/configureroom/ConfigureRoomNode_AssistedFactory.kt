package io.element.android.features.createroom.`impl`.configureroom

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ConfigureRoomNode::class)
@AssistedFactory
public interface ConfigureRoomNode_AssistedFactory : AssistedNodeFactory<ConfigureRoomNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ConfigureRoomNode
}
