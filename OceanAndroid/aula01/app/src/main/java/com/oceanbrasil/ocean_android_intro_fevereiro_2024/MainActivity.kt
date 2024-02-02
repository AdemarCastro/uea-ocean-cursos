package com.oceanbrasil.ocean_android_intro_fevereiro_2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Criar aplicações que funcionam para todos os dispositivos - Versão mais simples do JDK
    // Ele avisa que algum recurso da versão mais nova não está disponível na versão mais antiga
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Criar um listener para o botão
        // Encontrar o botão pelo ID

        // findViewById => método que encontra View no Layout usando o ID
        // Dentro dos <>, informamos o tipo do elemento que estamos buscando
        // Dentro dos (), informamos o ID do elemento, usando o R.id para buscar
        // Depois, armazenamos isso numa variável, para utilizarmos depois
        // val -> variável que inicia com um valor e esse valor nunca muda
        // var -> variável que iniciar com um valor e ease valor pode mudar
        val btEnviar = findViewById<Button>(R.id.btEnviar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val inpResult = findViewById<EditText>(R.id.inputText)

        // Criar um Listener para o botão btEnviar
        btEnviar.setOnClickListener {
            // Dentro das chaves {}, o código será executado
            // Quando o clique (toque) ocorrer no botão
            // tvResultado.text = "Ademar Castro!!"

            // Caso o inputResultado seja nulo ou vázio
            if (inpResult.text.toString() == "" || inpResult.text.toString() == null) {
                tvResultado.text = "Por favor, insira um valor válido!"
            } else {
                tvResultado.text = inpResult.text.toString()
            }
        }
    }
}