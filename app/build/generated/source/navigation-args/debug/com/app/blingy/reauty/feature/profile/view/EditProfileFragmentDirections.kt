package com.app.blingy.reauty.feature.profile.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class EditProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionEditProfileFragmentToProfileOptionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_editProfileFragment_to_profileOptionFragment)

    public fun actionEditProfileFragmentToUploadPictureFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_editProfileFragment_to_uploadPictureFragment)
  }
}
