package io.element.android.features.userprofile.`impl`.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(UserProfileNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface UserProfileNode_Module {
  @Binds
  @IntoMap
  @NodeKey(UserProfileNode::class)
  public fun bindUserProfileNodeFactory(factory: UserProfileNode_AssistedFactory): AssistedNodeFactory<*>
}
