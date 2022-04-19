package com.example.activitysplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Tela3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        val voltar = findViewById<Button>(R.id.voltar)

        voltar.setOnClickListener{
            val intent = Intent(this, NivelActivity::class.java)
            startActivity((intent))
            finish()
        }
    }
}