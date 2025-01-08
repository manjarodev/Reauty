package com.app.blingy.reauty.feature.scanner

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.app.blingy.reauty.R

public class ScannerFragmentDirections private constructor() {
  public companion object {
    public fun actionScannerFragmentToHomeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_scannerFragment_to_homeFragment)
  }
}
