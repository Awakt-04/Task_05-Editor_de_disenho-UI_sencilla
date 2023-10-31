package com.example.task05editordediseo_uisencilla

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

// Clase MainActivity
class MainActivity : AppCompatActivity() {
// Variable de inicio tardío de tipo Button
    private lateinit var btBoton1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// Busca el id del botón
        btBoton1 = findViewById(R.id.button)
// al pulsar el botón cambia color de fondo y texto (del botón)
        btBoton1.setOnClickListener{
            btBoton1.setBackgroundColor(Color.BLACK)
            btBoton1.setTextColor(Color.WHITE)
        }
    }
}
