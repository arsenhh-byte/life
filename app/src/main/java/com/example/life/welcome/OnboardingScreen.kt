package com.example.life.welcome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.life.R

class OnboardingScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen)
        //loading a default fragment for the frame layout
        supportFragmentManager.beginTransaction().replace(R.id.Fragcontainer,WelcomeScreenHealth_1()).commit()
    }
}