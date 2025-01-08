package com.app.blingy.reauty.feature.dashboard.presentation.view


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.app.blingy.reauty.R
import com.app.blingy.reauty.core.util.SessionManager
import com.app.blingy.reauty.databinding.ActivityDashboardBinding
import com.app.blingy.reauty.feature.chat.ChatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber


@AndroidEntryPoint
class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDashboardBinding
    private lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        // to show the app theme
        setTheme(R.style.Reauty_Light)
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sessionManager = SessionManager.getInstance(this)
        bottomNavRemoveWhiteSpace()
        setupNavController()
    }

    /**
     * walk around to remove the white space at the start of the BottomNavigationView
     */
    private fun bottomNavRemoveWhiteSpace() {
        binding.bottomNavigation.apply {
            background = null
            menu.getItem(2).isEnabled = false
        }
    }

    private fun setupNavController() {
        Timber.d("setupNavController: called")
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        setupBottomNavigation(navController)
        setUpNavSelectedListener(navController)
    }

    private fun setupBottomNavigation(navController: NavController) {
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController)
    }

    private fun setUpNavSelectedListener(navController: NavController) {
        binding.bottomNavigation.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.homeFragment -> {
                    navController.navigate(R.id.homeFragment)
                }
                R.id.searchHostFragment -> {
                    navController.navigate(R.id.searchHostFragment)
                }

                R.id.chatFragment -> {
//                    val chatFragment = ChatFragment()
//                    chatFragment.setStyle(
//                        DialogFragment.STYLE_NORMAL,
//                        R.style.bottomSheetStyleWrapper
//                    )
//                    chatFragment.show(supportFragmentManager, chatFragment.tag)

                    startActivity(Intent(this, ChatActivity::class.java))
                    overridePendingTransition(
                        R.anim.anim_from_bottom_to_top,
                        R.anim.anim_from_top_to_bottom
                    )
                }

                R.id.profileFragment -> {
                    navController.navigate(R.id.profileFragment)
                }

                else -> {

                }
            }

            return@OnNavigationItemSelectedListener false
        })
    }


    override fun onResume() {
        super.onResume()

        if (sessionManager.getIsFirstRun()) {

            sessionManager.setIsFirsRun(false)
        }

    }
}