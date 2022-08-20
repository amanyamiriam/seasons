package com.example.seasons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class DashboardActivity : AppCompatActivity() {
    var textViewName:EditText ?= null
    var textViewEmail:EditText ?= null
    var textViewHome:EditText ?= null
    var textViewVenue:EditText ?= null
    var textViewFood:EditText ?= null
    var textViewEquipments:EditText ?= null
    var textViewBooking:EditText ?= null
    var textViewCancel:EditText ?= null
    var textViewLogOut:EditText ?= null
    var textViewExit:EditText ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        textViewName = findViewById(R.id.mTvName)
        textViewEmail = findViewById(R.id.mTvEmail)
        textViewHome = findViewById(R.id.mTvHome)
        textViewVenue = findViewById(R.id.mTvVenue)
        textViewFood = findViewById(R.id.mTvFood)
        textViewEquipments = findViewById(R.id.mTvEquipments)
        textViewBooking = findViewById(R.id.mTvBooking)
        textViewCancel = findViewById(R.id.mTvCancel)
        textViewLogOut = findViewById(R.id.mTvLogOut)
        textViewExit = findViewById(R.id.mTvExit)

        textViewHome!!.setOnClickListener {
            var goToHome = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(goToHome)
        }


        textViewVenue!!.setOnClickListener {
            var goToVenue = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(goToVenue)
        }

        textViewFood!!.setOnClickListener {
            var goToFood = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(goToFood)
        }

        textViewEquipments!!.setOnClickListener {
            var goToEquipments = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(goToEquipments)
        }

        textViewBooking!!.setOnClickListener {
            var goToBooking = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(goToBooking)
        }

        textViewCancel!!.setOnClickListener {
            var goToCancel = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(goToCancel)
        }

        textViewLogOut!!.setOnClickListener {
            var goToLogOut = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(goToLogOut)
        }

        textViewExit!!.setOnClickListener {
            var goToExit = Intent(applicationContext, DashboardActivity::class.java)
            startActivity(goToExit)
        }
    }
}