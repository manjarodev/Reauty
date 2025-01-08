package com.app.blingy.reauty.feature.profile.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class ProfProductReviewFragmentDirections private constructor() {
  public companion object {
    public fun actionProfProductReviewFragmentToCommentFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profProductReviewFragment_to_commentFragment)
  }
}
