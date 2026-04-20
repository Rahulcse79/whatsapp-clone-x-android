package io.element.android.features.login.`impl`.screens.loginpassword

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(LoginPasswordNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface LoginPasswordNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LoginPasswordNode::class)
  public fun bindLoginPasswordNodeFactory(factory: LoginPasswordNode_AssistedFactory): AssistedNodeFactory<*>
}
