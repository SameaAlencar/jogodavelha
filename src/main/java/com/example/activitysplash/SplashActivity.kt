package com.example.activitysplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Timer().schedule(1000){ abrirJogar()}
    }

    private fun abrirJogar() {
        val intent = Intent(this, JogarActivity::class.java)
        startActivity((intent))
        finish()

    }
}