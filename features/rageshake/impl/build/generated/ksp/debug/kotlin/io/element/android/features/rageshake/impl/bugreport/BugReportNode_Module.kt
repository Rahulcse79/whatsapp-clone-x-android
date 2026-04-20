package io.element.android.features.rageshake.`impl`.bugreport

import dev.zacsweers.metro.AppScope
import dev.zacsweers.metro.BindingContainer
import dev.zacsweers.metro.Binds
import dev.zacsweers.metro.ContributesTo
import dev.zacsweers.metro.IntoMap
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import io.element.android.libraries.architecture.NodeKey

@Origin(BugReportNode::class)
@BindingContainer
@ContributesTo(AppScope::class)
public interface BugReportNode_Module {
  @Binds
  @IntoMap
  @NodeKey(BugReportNode::class)
  public fun bindBugReportNodeFactory(factory: BugReportNode_AssistedFactory): AssistedNodeFactory<*>
}
