package io.element.android.features.linknewdevice.`impl`.screens.number

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(EnterNumberNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface EnterNumberNode_Module {
  @Binds
  @IntoMap
  @NodeKey(EnterNumberNode::class)
  public fun bindEnterNumberNodeFactory(factory: EnterNumberNode_AssistedFactory): AssistedNodeFactory<*>
}
