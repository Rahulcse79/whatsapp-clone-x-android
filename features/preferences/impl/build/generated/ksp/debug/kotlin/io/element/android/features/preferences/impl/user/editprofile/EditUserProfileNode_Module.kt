package io.element.android.features.preferences.`impl`.user.editprofile

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(EditUserProfileNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface EditUserProfileNode_Module {
  @Binds
  @IntoMap
  @NodeKey(EditUserProfileNode::class)
  public fun bindEditUserProfileNodeFactory(factory: EditUserProfileNode_AssistedFactory): AssistedNodeFactory<*>
}
