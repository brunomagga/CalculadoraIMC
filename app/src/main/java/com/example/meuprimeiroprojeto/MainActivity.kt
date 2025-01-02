package com.example.meuprimeiroprojeto


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPeso = findViewById<TextInputEditText>(R.id.editText_Peso)
        val edtAltura = findViewById<TextInputEditText>(R.id.editTextAltura)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val pesoStr = edtPeso.text.toString()
            val alturaStr = edtAltura.text.toString()

            if(alturaStr == "" && pesoStr == ""){
                Snackbar.make(
                    edtPeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

            }else{
                val peso = pesoStr.toFloat()
                val altura = alturaStr.toFloat()


                val alturaQ2 = altura * altura
                val result =  peso / alturaQ2

                val intent = Intent(this, ResultActivity2::class.java)
                intent.putExtra(KEY_RESULT,result)
                startActivity(intent)

            }


        }


    }
}

