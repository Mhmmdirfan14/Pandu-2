package com.example.panduapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class OnboardingActivity4 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding4)

        val btnSkip3: Button = findViewById(R.id.btn_skip4)
        btnSkip3.setOnClickListener(this)

        val btnNext: Button = findViewById(R.id.btn_next4)
        btnNext.setOnClickListener(this)

        val ivBack4: ImageView = findViewById(R.id.back_on4)
        ivBack4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id){

            R.id.btn_next4-> {
                val intent = Intent (this@OnboardingActivity4, OnboardingActivity5::class.java)
                startActivity(intent)
            }

            R.id.btn_skip4 -> {
                val intent = Intent (this@OnboardingActivity4, LoginActivity::class.java)
                startActivity(intent)
            }

            R.id.back_on4 -> {
                val intent = Intent (this@OnboardingActivity4, OnboardingActivity3::class.java)
                startActivity(intent)
            }
        }
    }
}