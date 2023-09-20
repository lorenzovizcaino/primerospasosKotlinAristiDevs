package com.antonio.primerospasosKotlin.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.antonio.primerospasosKotlin.R


class FirstAppActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart=findViewById<AppCompatButton>(R.id.btnStart)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnStart.setOnClickListener {
            val texto=etName.text.toString()
            if (texto.isNotEmpty()){
//                Log.i("AristiDevs","Button Pulsado $texto")
                val intent= Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",texto)
                startActivity(intent)
            }

        }
    }
}