package io.element.android.features.securebackup.`impl`.reset.password

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ResetIdentityPasswordNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ResetIdentityPasswordNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ResetIdentityPasswordNode::class)
  public fun bindResetIdentityPasswordNodeFactory(factory: ResetIdentityPasswordNode_AssistedFactory): AssistedNodeFactory<*>
}
