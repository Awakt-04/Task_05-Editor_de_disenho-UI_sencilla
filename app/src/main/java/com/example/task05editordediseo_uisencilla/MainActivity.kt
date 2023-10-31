package com.example.task05editordediseo_uisencilla

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var btBoton1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btBoton1 = findViewById(R.id.button)

        btBoton1.setOnClickListener{
            btBoton1.setBackgroundColor(Color.BLACK)
            btBoton1.setTextColor(Color.WHITE)
        }
    }
}
