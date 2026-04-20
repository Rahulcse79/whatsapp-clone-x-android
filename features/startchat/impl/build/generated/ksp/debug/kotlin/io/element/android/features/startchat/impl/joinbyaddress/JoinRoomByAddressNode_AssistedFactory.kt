package io.element.android.features.startchat.`impl`.joinbyaddress

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(JoinRoomByAddressNode::class)
@AssistedFactory
public interface JoinRoomByAddressNode_AssistedFactory : AssistedNodeFactory<JoinRoomByAddressNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): JoinRoomByAddressNode
}
