package io.element.android.features.knockrequests.`impl`.list

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(KnockRequestsListNode::class)
@AssistedFactory
public interface KnockRequestsListNode_AssistedFactory : AssistedNodeFactory<KnockRequestsListNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): KnockRequestsListNode
}
