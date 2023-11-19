package com.example.panduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class OnboardingActivity3 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val btnSkip3:Button = findViewById(R.id.btn_skip3)
        btnSkip3.setOnClickListener(this)

        val btnNext: Button = findViewById(R.id.btn_next3)
        btnNext.setOnClickListener(this)

        val ivBack3: ImageView = findViewById(R.id.back_on3)
        ivBack3.setOnClickListener(this)
    }

     override fun onClick(v: View) {
         when (v.id){

             R.id.btn_next3 -> {
                 val intent = Intent (this@OnboardingActivity3, OnboardingActivity4::class.java)
                 startActivity(intent)
             }

             R.id.btn_skip3 -> {
                 val intent = Intent (this@OnboardingActivity3, LoginActivity::class.java)
                 startActivity(intent)
             }

             R.id.back_on3 -> {
                 val intent = Intent (this@OnboardingActivity3, OnboardingActivity2::class.java)
                 startActivity(intent)
             }
         }
     }

 }