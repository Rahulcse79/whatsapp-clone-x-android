package io.element.android.features.createroom.`impl`.configureroom

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ConfigureRoomNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ConfigureRoomNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ConfigureRoomNode::class)
  public fun bindConfigureRoomNodeFactory(factory: ConfigureRoomNode_AssistedFactory): AssistedNodeFactory<*>
}
