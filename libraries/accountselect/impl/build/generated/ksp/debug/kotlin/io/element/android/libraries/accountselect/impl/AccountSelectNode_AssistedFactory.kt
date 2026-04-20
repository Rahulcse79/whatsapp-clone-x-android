package io.element.android.libraries.accountselect.`impl`

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(AccountSelectNode::class)
@AssistedFactory
public interface AccountSelectNode_AssistedFactory : AssistedNodeFactory<AccountSelectNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): AccountSelectNode
}
