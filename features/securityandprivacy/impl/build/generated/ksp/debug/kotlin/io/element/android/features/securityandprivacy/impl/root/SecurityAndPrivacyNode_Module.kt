package io.element.android.features.securityandprivacy.`impl`.root

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.RoomScope

@Origin(SecurityAndPrivacyNode::class)
@BindingContainer
@ContributesTo(RoomScope::class)
public interface SecurityAndPrivacyNode_Module {
  @Binds
  @IntoMap
  @NodeKey(SecurityAndPrivacyNode::class)
  public fun bindSecurityAndPrivacyNodeFactory(factory: SecurityAndPrivacyNode_AssistedFactory): AssistedNodeFactory<*>
}
