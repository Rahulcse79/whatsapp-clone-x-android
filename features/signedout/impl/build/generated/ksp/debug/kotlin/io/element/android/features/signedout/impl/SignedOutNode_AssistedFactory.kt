package io.element.android.features.signedout.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(SignedOutNode::class)
@AssistedFactory
public interface SignedOutNode_AssistedFactory : AssistedNodeFactory<SignedOutNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): SignedOutNode
}
