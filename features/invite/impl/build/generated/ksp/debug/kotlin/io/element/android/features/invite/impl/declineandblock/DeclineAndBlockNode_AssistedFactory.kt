package io.element.android.features.invite.`impl`.declineandblock

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(DeclineAndBlockNode::class)
@AssistedFactory
public interface DeclineAndBlockNode_AssistedFactory : AssistedNodeFactory<DeclineAndBlockNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): DeclineAndBlockNode
}
