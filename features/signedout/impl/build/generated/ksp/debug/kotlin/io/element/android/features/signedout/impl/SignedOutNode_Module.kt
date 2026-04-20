package io.element.android.features.signedout.`impl`

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(SignedOutNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface SignedOutNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SignedOutNode::class)
  public fun bindSignedOutNodeFactory(factory: SignedOutNode_AssistedFactory): AssistedNodeFactory<*>
}
