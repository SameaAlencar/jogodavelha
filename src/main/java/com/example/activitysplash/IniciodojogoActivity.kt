package com.example.activitysplash

import android.content.Intent
import android.os.Build.ID
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import java.util.ArrayList

class IniciodojogoActivity : AppCompatActivity() {

    var perdeu: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciodojogo)

        val voltar = findViewById<Button>(R.id.voltar)
        val button1 = findViewById<ImageButton>(R.id.Button1)
        voltar.setOnClickListener {
            val intent = Intent(this, JogadoresActivity::class.java)
            startActivity((intent))
            finish()
        }

        button1.setOnClickListener{ button1.setImageResource(R.drawable.x) }

        fun redefinir() {
//            finish()
//            startActivity(this.intent);
        }



        var jogador1 = ArrayList<Int>()
        var jogador2 = ArrayList<Int>()
        var turnoJogador = 1


        fun checarVencedor() {
            var vencedor = -1

            //botoes na primeira horizontal
            if (jogador1.contains(1) && jogador1.contains(2) && jogador1.contains(3)) {
                vencedor = 1
            }
            if (jogador2.contains(1) && jogador2.contains(2) && jogador2.contains(3)) {
                vencedor = 2
            }
            //botoes na segunda horizontal
            if (jogador1.contains(4) && jogador1.contains(5) && jogador1.contains(6)) {
                vencedor = 1
            }
            if (jogador2.contains(4) && jogador2.contains(5) && jogador2.contains(6)) {
                vencedor = 2
            }
            //botoes na terceira horizontal
            if (jogador1.contains(7) && jogador1.contains(8) && jogador1.contains(9)) {
                vencedor = 1
            }
            if (jogador2.contains(7) && jogador2.contains(8) && jogador2.contains(9)) {
                vencedor = 2
            }

            // botoes na primeira vertical
            if (jogador1.contains(1) && jogador1.contains(4) && jogador1.contains(7)) {
                vencedor = 1
            }
            if (jogador2.contains(1) && jogador2.contains(4) && jogador2.contains(7)) {
                vencedor = 2
            }
            //botoes na segunda vertical
            if (jogador1.contains(2) && jogador1.contains(5) && jogador1.contains(8)) {
                vencedor = 1
            }
            if (jogador2.contains(2) && jogador2.contains(5) && jogador2.contains(8)) {
                vencedor = 2
            }
            //botoes na terceira vertical
            if (jogador1.contains(3) && jogador1.contains(6) && jogador1.contains(9)) {
                vencedor = 1
            }
            if (jogador2.contains(3) && jogador2.contains(6) && jogador2.contains(9)) {
                vencedor = 2
            }
            //botoes da diaginal esquerda para direita
            if (jogador1.contains(1) && jogador1.contains(5) && jogador1.contains(9)) {
                vencedor = 1
            }
            if (jogador2.contains(1) && jogador2.contains(5) && jogador2.contains(9)) {
                vencedor = 2
            }
            //botoes da diagonal direita para esquerda
            if (jogador1.contains(3) && jogador1.contains(5) && jogador1.contains(7)) {
                vencedor = 1
            }
            if (jogador2.contains(3) && jogador2.contains(5) && jogador2.contains(7)) {
                vencedor = 2
            }


            if (vencedor != -1) {
                if (vencedor == 1) {
                    Toast.makeText(this, "Jogador 1 ganhou!", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Jogador 2 ganhou", Toast.LENGTH_SHORT).show()
                }
                perdeu = true
            }

        }

        fun comecarJogo(ID: Int, buttonSelecionar: ImageButton) {

            if (turnoJogador == 1) {
                buttonSelecionar.setImageResource(R.drawable.x)
                jogador1.add(ID)
                turnoJogador = 2
            } else {
                buttonSelecionar.setImageResource(R.drawable.o)
                jogador2.add(ID)
                turnoJogador = 1
            }
            buttonSelecionar.isEnabled = false
            checarVencedor()

        }
        fun buttonClick(view: View) {
//            val buttonSelecionar = view as ImageButton
//            var ID = 0
//
//
//            when (buttonSelecionar.id) {
//                R.id.Button1 -> ID = 1
//                R.id.Button2 -> ID = 2
//                R.id.Button3 -> ID = 3
//                R.id.Button4 -> ID = 4
//                R.id.Button5 -> ID = 5
//                R.id.Button6 -> ID = 6
//                R.id.Button7 -> ID = 7
//                R.id.Button8 -> ID = 8
//                R.id.Button9 -> ID = 9
//            }
//
//            if (perdeu == false) {
//                comecarJogo(ID, buttonSelecionar)
//            } else {
//                Handler().postDelayed({ redefinir() }, 10)
//            }
//
//
        }


    }
}


