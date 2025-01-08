package com.app.blingy.reauty.feature.search.presentation.view

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class SearchHostFragmentDirections private constructor() {
  public companion object {
    public fun actionSearchHostFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_searchHostFragment_to_homeFragment)

    public fun actionSearchHostFragmentToScannerFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_searchHostFragment_to_scannerFragment)
  }
}
