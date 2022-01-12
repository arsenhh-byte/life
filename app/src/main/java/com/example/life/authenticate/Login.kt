package com.example.life.authenticate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.life.R
import com.example.life.screens.HomeActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    var emaillogin: String = " "
    var passLogin: String = " "
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        auth = FirebaseAuth.getInstance()

        tvSignup.setOnClickListener {
            val intent = Intent(applicationContext,SignUp::class.java)
            startActivity(intent)


        }

        tvForgotpass.setOnClickListener{
            val intent = Intent(applicationContext,ForgotPassword::class.java)
            startActivity(intent)
        }
        btnLogin.setOnClickListener{
            captureinput()

        }

    }

    private fun captureinput() {
        emaillogin=editUsername.text.toString()
        passLogin=editPass.text.toString()
        if(emaillogin.isEmpty()&&passLogin.isEmpty()){
            Toast.makeText(applicationContext,"Fields cannot be empty", Toast.LENGTH_LONG).show()

        }else{
            loginUser(emaillogin,passLogin)
        }
    }


    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if(currentUser != null){
            updateUI();
        }
    }


    private fun updateUI() {
        val intent = Intent(applicationContext, HomeActivity::class.java)
        startActivity(intent)

    }


    fun loginUser(emaillogin: String, passLogin: String) {
        auth.signInWithEmailAndPassword(emaillogin, passLogin)
            .addOnCompleteListener{
                if(it.isSuccessful){
                    Toast.makeText(applicationContext,"Login Successful", Toast.LENGTH_LONG).show()
                    Log.d("auth", "details are " + it.result)
                    updateUI()
                } else {

                    Toast.makeText(applicationContext,"Login Failed, please try again", Toast.LENGTH_LONG).show()
                    Log.d("auth", "details are " + it.exception)
                }
            }

    }
}


