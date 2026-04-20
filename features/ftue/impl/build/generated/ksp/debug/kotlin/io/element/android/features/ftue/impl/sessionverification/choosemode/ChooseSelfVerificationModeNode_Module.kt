package io.element.android.features.ftue.`impl`.sessionverification.choosemode

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ChooseSelfVerificationModeNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ChooseSelfVerificationModeNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ChooseSelfVerificationModeNode::class)
  public fun bindChooseSelfVerificationModeNodeFactory(factory: ChooseSelfVerificationModeNode_AssistedFactory): AssistedNodeFactory<*>
}
