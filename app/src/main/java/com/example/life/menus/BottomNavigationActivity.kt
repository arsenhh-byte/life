package com.example.life.menus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.life.R
import com.example.life.screens.*
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationActivity : AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener {
    //initializing variable to tag bottom nav
    private lateinit var bottomNav: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        //view identification
        bottomNav= findViewById(R.id.bottomview)
        bottomNav.setOnNavigationItemSelectedListener(this)


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.nav_home->{
                val intentHome= Intent(this@BottomNavigationActivity, HomeActivity::class.java)
                startActivity(intentHome)
            }
            R.id.nav_recce->{
                val intentRecce= Intent(this@BottomNavigationActivity,ExploreActivity::class.java)
                startActivity(intentRecce)
            }
            R.id.nav_inbox->{
                val intentMessages= Intent(this@BottomNavigationActivity,InboxActivity::class.java)
                startActivity(intentMessages)
            }
            R.id.nav_track->{
                val intentTrack= Intent(this@BottomNavigationActivity, TrackActivity::class.java)
                startActivity(intentTrack)
            }
            R.id.nav_emergency->{
                val intentEmergency= Intent(this@BottomNavigationActivity, EmergencyActivity::class.java)
                startActivity(intentEmergency)
            }

        }
        return true

    }
}