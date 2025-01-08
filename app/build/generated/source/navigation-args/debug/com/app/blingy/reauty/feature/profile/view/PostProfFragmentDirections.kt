package com.app.blingy.reauty.feature.profile.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class PostProfFragmentDirections private constructor() {
  public companion object {
    public fun actionPostProfFragmentToUserPostsFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_postProfFragment_to_userPostsFragment)

    public fun actionPostProfFragmentToCommentFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_postProfFragment_to_commentFragment)
  }
}
