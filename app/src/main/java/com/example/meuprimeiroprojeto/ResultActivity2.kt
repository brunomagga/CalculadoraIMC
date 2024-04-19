package com.example.meuprimeiroprojeto

import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result2)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textView_classificacao)

        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)

        tvResult.text = result.toString()

        var classificacao = ""

        if(result < 18.5f){
            classificacao = "ABAIXO DO PESO"
        }else if(result in 18.5f..24.9f) {
            classificacao = "NORMAL"
        }else if(result in 25f..29.9f){
            classificacao = "SOBREPESO"
        }else if(result in 30f..39.9f){
            classificacao = "OBESIDADE"
        }else {
            classificacao = "OBESIDADE GRAVE"
        }

        tvClassificacao.text = getString(R.string.message_classificacao, classificacao)
        }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onContextItemSelected(item)
    }
    }




