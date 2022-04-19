package com.example.activitysplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JogarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogar)

        val jogar = findViewById<Button>(R.id.jogar)
        val sair = findViewById<Button>(R.id.sair)

        jogar.setOnClickListener{
            val intent = Intent(this, JogadoresActivity::class.java)
            startActivity((intent))
            finish()
        }

        sair.setOnClickListener{
            finish()
        }
    }
}