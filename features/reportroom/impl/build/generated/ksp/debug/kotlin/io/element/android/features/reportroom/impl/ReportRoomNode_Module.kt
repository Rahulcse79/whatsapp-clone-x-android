package io.element.android.features.reportroom.`impl`

import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey
import io.element.android.libraries.di.SessionScope

@Origin(ReportRoomNode::class)
@BindingContainer
@ContributesTo(SessionScope::class)
public interface ReportRoomNode_Module {
  @Binds
  @IntoMap
  @NodeKey(ReportRoomNode::class)
  public fun bindReportRoomNodeFactory(factory: ReportRoomNode_AssistedFactory): AssistedNodeFactory<*>
}
