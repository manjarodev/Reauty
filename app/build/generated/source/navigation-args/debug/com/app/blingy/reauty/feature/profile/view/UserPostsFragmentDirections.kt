package com.app.blingy.reauty.feature.profile.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class UserPostsFragmentDirections private constructor() {
  public companion object {
    public fun actionUserPostsFragmentToCommentFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_userPostsFragment_to_commentFragment)
  }
}
