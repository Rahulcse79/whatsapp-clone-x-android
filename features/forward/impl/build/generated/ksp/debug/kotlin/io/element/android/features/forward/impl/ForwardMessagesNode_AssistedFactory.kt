package io.element.android.features.forward.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(ForwardMessagesNode::class)
@AssistedFactory
public interface ForwardMessagesNode_AssistedFactory : AssistedNodeFactory<ForwardMessagesNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): ForwardMessagesNode
}
