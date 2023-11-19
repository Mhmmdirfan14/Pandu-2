package com.example.panduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class OnboardingActivity5 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding5)

        val btnLogin: Button = findViewById(R.id.btn_mulai)
        btnLogin.setOnClickListener(this)

        val ivBack5: ImageView = findViewById(R.id.back_on5)
        ivBack5.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_mulai -> {

                val intent = Intent(this@OnboardingActivity5, LoginActivity::class.java)
                startActivity(intent)
            }

            R.id.back_on5 -> {
                val intent = Intent (this@OnboardingActivity5, OnboardingActivity4::class.java)
                startActivity(intent)
            }
        }
    }
}