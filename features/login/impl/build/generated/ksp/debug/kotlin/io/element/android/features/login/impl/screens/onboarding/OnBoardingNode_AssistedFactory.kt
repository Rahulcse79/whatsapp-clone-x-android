package io.element.android.features.login.`impl`.screens.onboarding

import com.bumble.appyx.core.modality.BuildContext
import com.bumble.appyx.core.plugin.Plugin
import dev.zacsweers.metro.AssistedFactory
import dev.zacsweers.metro.Origin
import io.element.android.libraries.architecture.AssistedNodeFactory
import kotlin.collections.List

@Origin(OnBoardingNode::class)
@AssistedFactory
public interface OnBoardingNode_AssistedFactory : AssistedNodeFactory<OnBoardingNode> {
  override fun create(buildContext: BuildContext, plugins: List<Plugin>): OnBoardingNode
}
