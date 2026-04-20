package io.element.android.features.ftue.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(FtueFlowNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface FtueFlowNode_Module {
  @Binds
  @IntoMap
  @NodeKey(FtueFlowNode::class)
  public fun bindFtueFlowNodeFactory(factory: FtueFlowNode_AssistedFactory): AssistedNodeFactory<*>
}
