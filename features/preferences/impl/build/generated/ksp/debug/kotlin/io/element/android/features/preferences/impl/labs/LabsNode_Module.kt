package io.element.android.features.preferences.`impl`.labs

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(LabsNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface LabsNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LabsNode::class)
  public fun bindLabsNodeFactory(factory: LabsNode_AssistedFactory): AssistedNodeFactory<*>
}
