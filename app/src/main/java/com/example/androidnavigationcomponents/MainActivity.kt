package com.example.androidnavigationcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_containerID)
                as NavHostFragment

        navController = navHostFragment.findNavController()
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.fragmentHome, R.id.fragmentSearch),
            navigation_drawerID
        )

        setSupportActionBar(toolbarID)
        setupActionBarWithNavController(navController, appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)
        navigationViewID.setupWithNavController(navController)

        navigationViewID.setNavigationItemSelectedListener {
            if(it.itemId == R.id.exitBtnID){
//                super.onBackPressed()
                finish()
            }
            true
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_nav_menu, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.settingBtnID -> {
                val action = NavGraphDirections.actionGlobalFragmentSetting()
                navController.navigate(action)
                true
            }
            R.id.aboutBtnID -> {
                val action = NavGraphDirections.actionGlobalFragmentAbout()
                navController.navigate(action)
                true
            }
            else -> {
                item.onNavDestinationSelected(navController)
                        || super.onOptionsItemSelected(item)
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

}