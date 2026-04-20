package io.element.android.features.linknewdevice.`impl`.screens.error

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ErrorNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ErrorNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ErrorNode::class)
  public fun bindErrorNodeFactory(factory: ErrorNode_AssistedFactory): AssistedNodeFactory<*>
}
