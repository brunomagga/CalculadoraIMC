package com.example.meuprimeiroprojeto

import android.os.Bundle
import android.view.MenuItem
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESULT = "ResultActivity.KEY_IMC"
class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result2)

        val result = intent.getFloatExtra(KEY_RESULT, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificação = findViewById<TextView>(R.id.tv_classificação)

        tvResult.text = result.toString()


        val classificação = if(result <= 18.5f){
            "ABAIXO DO PESO"
        }else if(result in 18.5f..24.9f) {
            "NORMAL"
        }else if(result in 25f..29.9f){
            "SOBREPESO"
        }else if(result in 30f..39.9f){
            "OBESIDADE"
        }else {
            "OBESIDADE GRAVE"
        }
        tvClassificação.text = classificação









    }
}

       // tvClassificacao.text = getString(R.string.message_classificacao, classificacao)
