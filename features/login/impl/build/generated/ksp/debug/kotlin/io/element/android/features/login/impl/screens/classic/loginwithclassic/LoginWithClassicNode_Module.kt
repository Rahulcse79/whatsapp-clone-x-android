package io.element.android.features.login.`impl`.screens.classic.loginwithclassic

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(LoginWithClassicNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface LoginWithClassicNode_Module {
  @Binds
  @IntoMap
  @NodeKey(LoginWithClassicNode::class)
  public fun bindLoginWithClassicNodeFactory(factory: LoginWithClassicNode_AssistedFactory): AssistedNodeFactory<*>
}
