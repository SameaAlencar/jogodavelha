package com.example.activitysplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class JogadoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jogadores)

        val jogadores = findViewById<Button>(R.id.jogador)
        val computador = findViewById<Button>(R.id.computador)

        jogadores.setOnClickListener{
            val intent = Intent(this, IniciodojogoActivity::class.java)
            startActivity((intent))
            finish()
        }

        computador.setOnClickListener{
            val intent = Intent(this, NivelActivity::class.java)
            startActivity((intent))
            finish()

        }
    }

}