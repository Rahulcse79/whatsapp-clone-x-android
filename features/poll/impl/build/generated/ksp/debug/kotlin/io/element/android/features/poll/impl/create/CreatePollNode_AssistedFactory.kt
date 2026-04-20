package io.element.android.features.poll.`impl`.create

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(CreatePollNode::class)
@AssistedFactory
public interface CreatePollNode_AssistedFactory : AssistedNodeFactory<CreatePollNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): CreatePollNode
}
