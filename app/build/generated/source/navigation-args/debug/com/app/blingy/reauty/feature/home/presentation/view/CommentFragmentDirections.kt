package com.app.blingy.reauty.feature.home.presentation.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class CommentFragmentDirections private constructor() {
  public companion object {
    public fun actionCommentFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_commentFragment_to_homeFragment)
  }
}
