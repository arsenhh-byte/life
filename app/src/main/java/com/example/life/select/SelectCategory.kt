package com.example.life.select

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.life.R
import com.example.life.screens.HomeActivity
import com.example.life.welcome.WelcomeScreenLifestyle_2
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import kotlinx.android.synthetic.main.fragment_select_category.*


class SelectCategory : Fragment() {
    private lateinit var auth: FirebaseAuth
    private var FirebaseStore: FirebaseStorage? = null
    private var storageReference: StorageReference? = null
    private var databaseReference: DatabaseReference? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_select_category, container, false)

        //view identification
        val btnSkip=view?.findViewById<Button>(R.id.btn_continue)


        //initialization of the various activity to be selected from the database
        auth = FirebaseAuth.getInstance()
        FirebaseStore = FirebaseStorage.getInstance()
        storageReference = FirebaseStorage.getInstance().reference
        databaseReference = FirebaseDatabase.getInstance().getReference("categorydata")


//        pick5?.setOnClickListener {
//            val intent = Intent(applicationContext, HomeActivity::class.java)
//            startActivity(intent)
//        }
//

//        Routines.setOnClickListener {
//
//        }
//
//        Recipes.setOnClickListener{
//
//        }
//
//
//        Whatsnew.setOnClickListener{
//
//        }
//        Mindfulness.setOnClickListener{
//
//        }



    }


}