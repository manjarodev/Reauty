package com.app.blingy.reauty.feature.home.presentation.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class BeautyTipFragmentDirections private constructor() {
  public companion object {
    public fun actionBeautyTipFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_beautyTipFragment_to_homeFragment)
  }
}
