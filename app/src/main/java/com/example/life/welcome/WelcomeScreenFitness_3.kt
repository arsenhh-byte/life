package com.example.life.welcome

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.example.life.R
import com.example.life.authenticate.Login
import com.example.life.authenticate.SignUp
import kotlinx.android.synthetic.main.activity_forgot_password.*

class WelcomeScreenFitness_3 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome_fitness, container, false)

        //View Identificaton for my button
        val BtnGetStarted = view?.findViewById<Button>(R.id.BtnGetStarted)

        BtnGetStarted?.setOnClickListener {
            val intent = Intent(context, SignUp::class.java)
            startActivity(intent)
        }
        return view
    }

}