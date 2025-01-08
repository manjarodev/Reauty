package com.app.blingy.reauty.feature.auth.presentation.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class CreateProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionCreateProfileFragmentToCreateUniqueNameFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_createProfileFragment_to_createUniqueNameFragment)

    public fun actionCreateProfileFragmentToEulaFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_createProfileFragment_to_eulaFragment)
  }
}
