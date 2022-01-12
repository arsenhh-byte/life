package com.example.life

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.life.welcome.OnboardingScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({

            //other functions can be used in the handler class...eg after a certain time;
            // a certain function should be deactivated
            //or even intents

            val intent= Intent(this, OnboardingScreen::class.java)
            startActivity(intent)
        },3000)//screen will show for 3 seconds
    }
}