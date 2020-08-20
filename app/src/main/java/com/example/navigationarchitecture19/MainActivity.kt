package com.example.navigationarchitecture19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        BottomNav()
    }

    private fun BottomNav() {
        val navView = findViewById<BottomNavigationView>(R.id.bottomNav)
        val navId =  listOf(R.navigation.alarm,
            R.navigation.calendar ,
            R.navigation.computer)

        navView.setupWithNavController(
          navGraphIds = navId,
          fragmentManager = supportFragmentManager,
          containerId = R.id.navView,
          intent = intent
         )

    }
}