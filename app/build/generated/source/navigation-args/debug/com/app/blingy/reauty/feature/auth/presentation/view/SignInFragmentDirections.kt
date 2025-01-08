package com.app.blingy.reauty.feature.auth.presentation.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class SignInFragmentDirections private constructor() {
  public companion object {
    public fun actionSignInFragmentToCreateProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signInFragment_to_createProfileFragment)

    public fun actionSignInFragmentToCreateUniqueNameFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_signInFragment_to_createUniqueNameFragment)
  }
}
