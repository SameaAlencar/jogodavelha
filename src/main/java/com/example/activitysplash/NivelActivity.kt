package com.example.activitysplash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NivelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nivel)

        val facil = findViewById<Button>(R.id.facil)
        val medio = findViewById<Button>(R.id.medio)
        val dificil = findViewById<Button>(R.id.dificil)

        facil.setOnClickListener{
            val intent = Intent(this, Tela3Activity::class.java)
            startActivity((intent))
            finish()
        }

        medio.setOnClickListener{
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity((intent))
            finish()
        }

        dificil.setOnClickListener{
            val intent = Intent(this, TelaActivity::class.java)
            startActivity((intent))
            finish()
        }
    }
}