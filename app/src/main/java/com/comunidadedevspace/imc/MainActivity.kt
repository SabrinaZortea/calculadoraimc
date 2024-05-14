package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// Recuperar os componentes EditText
        // Criar uma variavel e associar (=) o componente de UI<EditText>
        // Recuperar o botão da tela

        //Colocar a ação no botão setOnClickListener
        // Recuperar o texto ediatado no edt peso

        val edtPeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.edt_altura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso: Float = edtPeso.text.toString().toFloat()
            val altura: Float = edtAltura.text.toString().toFloat()

            val altura02 = altura * altura
            val resultado = peso / altura02
            println("Sabrina ação botão" + resultado)

        }
    }
}