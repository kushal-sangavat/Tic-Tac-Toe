package com.example.tictactoe

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import android.os.Handler


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },3000)
    }
}