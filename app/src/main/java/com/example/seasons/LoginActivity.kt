package com.example.seasons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    var editTextEmail:EditText ?= null
    var editTextPassword:EditText ?= null
    var textViewAccount:EditText ?= null
    var textViewSignUp:EditText ?= null
    var buttonSignIn:EditText ?= null
    var buttonSignUp:EditText ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        editTextEmail = findViewById(R.id.mEdtEmail)
        editTextPassword = findViewById(R.id.mEdtPassword)
        textViewAccount = findViewById(R.id.mTvAccount)
        textViewSignUp = findViewById(R.id.mTvSignUp)
        buttonSignIn = findViewById(R.id.mBtnSignIn)
        buttonSignUp = findViewById(R.id.mBtnSignUp)

        buttonSignIn!!.setOnClickListener {
            var goToLogin = Intent(applicationContext,LoginActivity::class.java)
            startActivity(goToLogin)
        }
        buttonSignUp!!.setOnClickListener {
            var goToRegister = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(goToRegister)
        }

    }
}