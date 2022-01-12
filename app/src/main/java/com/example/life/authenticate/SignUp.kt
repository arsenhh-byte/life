package com.example.life.authenticate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.life.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    var firstName:String = " "
    var lastname:String = " "
    var username:String=""
    var email: String=""
    var pass: String=""
    var date:Int=0
    var year:Int=0
    var month:String=""
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        tvLoginsign.setOnClickListener{
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
        }

        tvForgot.setOnClickListener{
            val intent = Intent(applicationContext, ForgotPassword::class.java)
            startActivity(intent)
        }

        btnSignup.setOnClickListener{
            captureInput()


        }

    }

    private fun captureInput() {
        firstName = editName.text.toString()
        lastname = editName2.text.toString()
        username = editUsername.text.toString()
        email = editEmail.text.toString()
        pass = editPass.text.toString()


        registerToFirebase(email,pass,)
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
        val intent = Intent(applicationContext,Login::class.java)
        startActivity(intent)

    }


    private fun registerToFirebase( email: String, confirmedPassword: String) {

        auth.createUserWithEmailAndPassword(email, confirmedPassword)
            .addOnCompleteListener(this){
                if(it.isSuccessful){
                    Toast.makeText(applicationContext,"Your Account is successfully created", Toast.LENGTH_LONG).show()
                    Log.d("auth","details are"+it.result)
                    updateUI()
                }else {
                    Toast.makeText(applicationContext,"Your Account is not created, try again", Toast.LENGTH_LONG).show()
                    Log.d("auth","details are"+it.exception)
                    updateUI()
                }
            }
    }
}