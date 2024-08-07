package com.example.navigationdrawer


import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val drawerLayout: DrawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.nav_home -> Toast.makeText(applicationContext, "Clikced ", Toast.LENGTH_LONG)
                    .show()
                R.id.nav_message -> Toast.makeText(
                    applicationContext,
                    "Clikced ",
                    Toast.LENGTH_LONG
                ).show()
                R.id.nav_sync -> Toast.makeText(applicationContext, "Clikced ", Toast.LENGTH_LONG)
                    .show()
                R.id.settings -> Toast.makeText(applicationContext, "Clikced ", Toast.LENGTH_LONG)
                    .show()
                R.id.nav_login -> Toast.makeText(applicationContext, "Clikced ", Toast.LENGTH_LONG)
                    .show()
                R.id.nav_share -> Toast.makeText(applicationContext, "Clikced ", Toast.LENGTH_LONG)
                    .show()
                R.id.nav_rate_us -> Toast.makeText(
                    applicationContext,
                    "Clikced ",
                    Toast.LENGTH_LONG
                ).show()

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem):Boolean {
        return if (toggle.onOptionsItemSelected(item)) {
            true
        } else
            super.onOptionsItemSelected(item)


    }

}