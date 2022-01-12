package com.example.life.welcome

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.life.R
import com.example.life.authenticate.SignUp


class WelcomeScreenHealth_1 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_welcome_health, container, false)


//View Identificatons for my texts
        val textNext=view?.findViewById<TextView>(R.id.textNext)
        val textSkip=view?.findViewById<TextView>(R.id.textSkip)


        textNext?.setOnClickListener {
            val transaction = activity?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.Fragcontainer,WelcomeScreenLifestyle_2())
            transaction?.disallowAddToBackStack()
            transaction?.commit()
        }

        textSkip?.setOnClickListener{
            val intent = Intent(context, SignUp::class.java)
            startActivity(intent)

        }
        return view
    }




}