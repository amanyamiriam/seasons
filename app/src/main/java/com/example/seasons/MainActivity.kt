package com.example.seasons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var textViewPlanning:EditText ?= null
    var buttonWelcome:EditText ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textViewPlanning = findViewById(R.id.mTvPlanning)
        buttonWelcome = findViewById(R.id.mBtnWelcome)

        buttonWelcome!!.setOnClickListener {
            var goToRegister = Intent(applicationContext,RegisterActivity::class.java)
            startActivity(goToRegister)
        }

    }
}