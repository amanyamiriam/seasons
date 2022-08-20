package com.example.seasons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    var editTextName:EditText ?= null
    var editTextEmail:EditText ?= null
    var editTextPassword:EditText ?= null
    var textViewSignUp:EditText ?= null
    var textViewAccount:EditText ?= null
    var textViewSignIn:EditText ?= null
    var buttonSignUp:EditText ?= null
    var buttonSignIn:EditText ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        editTextName = findViewById(R.id.mEdtName)
        editTextEmail = findViewById(R.id.mEdtEmail)
        editTextPassword = findViewById(R.id.mEdtPassword)
        textViewSignUp = findViewById(R.id.mTvSignUp)
        textViewAccount = findViewById(R.id.mTvAccount)
        textViewSignIn = findViewById(R.id.mTvSignIn)
        buttonSignUp = findViewById(R.id.mBtnSignUp)
        buttonSignIn = findViewById(R.id.mBtnSignIn)

        buttonSignUp!!.setOnClickListener {
            var goToRegister = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(goToRegister)
        }
        buttonSignIn!!.setOnClickListener {
            var goToLogin = Intent(applicationContext,LoginActivity::class.java)
            startActivity(goToLogin)
        }



    }
}