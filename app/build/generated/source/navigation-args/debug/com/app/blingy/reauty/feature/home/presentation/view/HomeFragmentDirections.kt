package com.app.blingy.reauty.feature.home.presentation.view

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R
import com.app.blingy.reauty.core.domain.model.feed.BeautyTipType
import java.io.Serializable
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToBeautyTipFragment(
    public val beautyTipTypeSafeArgs: BeautyTipType = BeautyTipType.ACNE_PRONE
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_homeFragment_to_beautyTipFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(BeautyTipType::class.java)) {
        result.putParcelable("beautyTipTypeSafeArgs", this.beautyTipTypeSafeArgs as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(BeautyTipType::class.java)) {
        result.putSerializable("beautyTipTypeSafeArgs", this.beautyTipTypeSafeArgs as Serializable)
      }
      return result
    }
  }

  public companion object {
    public fun actionHomeFragmentToBeautyTipFragment(beautyTipTypeSafeArgs: BeautyTipType =
        BeautyTipType.ACNE_PRONE): NavDirections =
        ActionHomeFragmentToBeautyTipFragment(beautyTipTypeSafeArgs)

    public fun actionHomeFragmentToCommentFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_commentFragment)

    public fun actionHomeFragmentToSearchHostFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_searchHostFragment)

    public fun actionHomeFragmentToScannerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_scannerFragment)
  }
}
