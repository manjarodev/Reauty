package com.app.blingy.reauty.feature.profile.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class ProfileOptionFragmentDirections private constructor() {
  public companion object {
    public fun actionProfileOptionFragmentToEditProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileOptionFragment_to_editProfileFragment)

    public fun actionProfileOptionFragmentToProfileFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileOptionFragment_to_profileFragment)
  }
}
