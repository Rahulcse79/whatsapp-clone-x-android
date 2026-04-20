package io.element.android.libraries.accountselect.`impl`

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(AccountSelectNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface AccountSelectNode_Module {
  @Binds
  @IntoMap
  @NodeKey(AccountSelectNode::class)
  public fun bindAccountSelectNodeFactory(factory: AccountSelectNode_AssistedFactory): AssistedNodeFactory<*>
}
