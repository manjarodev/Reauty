package com.app.blingy.reauty.feature.auth.presentation.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class EulaFragmentDirections private constructor() {
  public companion object {
    public fun actionEulaFragmentToCreateProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_eulaFragment_to_createProfileFragment)
  }
}
