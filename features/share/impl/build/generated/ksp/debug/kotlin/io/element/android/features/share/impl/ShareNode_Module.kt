package io.element.android.features.share.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ShareNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ShareNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ShareNode::class)
  public fun bindShareNodeFactory(factory: ShareNode_AssistedFactory): AssistedNodeFactory<*>
}
