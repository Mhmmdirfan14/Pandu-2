package com.example.panduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class OnboardingActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val btnSKip2: Button = findViewById(R.id.btn_skip2)
        btnSKip2.setOnClickListener(this)

        val btnNext2: Button = findViewById(R.id.btn_next2)
        btnNext2.setOnClickListener(this)

        val ivBack2: ImageView = findViewById(R.id.back_on2)
        ivBack2.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){

            R.id.btn_next2 -> {
                val intent = Intent (this@OnboardingActivity2, OnboardingActivity3::class.java)
                startActivity(intent)
            }

            R.id.btn_skip2 -> {
                val intent = Intent (this@OnboardingActivity2, LoginActivity::class.java)
                startActivity(intent)
            }

            R.id.back_on2 -> {
                val intent = Intent (this@OnboardingActivity2, OnboardingActivity::class.java)
                startActivity(intent)
            }
        }

    }
}