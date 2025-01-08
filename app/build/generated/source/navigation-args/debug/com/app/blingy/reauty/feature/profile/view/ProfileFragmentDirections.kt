package com.app.blingy.reauty.feature.profile.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class ProfileFragmentDirections private constructor() {
  public companion object {
    public fun actionProfileFragmentToProfileOptionFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_profileOptionFragment)

    public fun actionProfileFragmentToUserPostsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_userPostsFragment)

    public fun actionProfileFragmentToFollowersHostFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_followersHostFragment)
  }
}
