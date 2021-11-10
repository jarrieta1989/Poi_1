package com.jarrieta.poi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          val botton: Button = findViewById(R.id.ingreButton)

        botton.setOnClickListener{
        Toast.makeText(applicationContext,"hola",Toast.LENGTH_SHORT).show()

        }




    }





}