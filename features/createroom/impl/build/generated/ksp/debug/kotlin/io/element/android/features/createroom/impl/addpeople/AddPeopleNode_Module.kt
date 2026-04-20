package io.element.android.features.createroom.`impl`.addpeople

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(AddPeopleNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface AddPeopleNode_Module {
  @Binds
  @IntoMap
  @NodeKey(AddPeopleNode::class)
  public fun bindAddPeopleNodeFactory(factory: AddPeopleNode_AssistedFactory): AssistedNodeFactory<*>
}
