package com.example.fitness

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        supportActionBar?.hide()
        val bmi=findViewById<ImageView>(R.id.imgBMI)
        val sensor=findViewById<ImageView>(R.id.imgPedometer)

        bmi.setOnClickListener() {
            val i=Intent(this, BMIActivity::class.java)
            startActivity(i)
        }

        sensor.setOnClickListener() {
            val i=Intent(this, PedoSensor::class.java)
            startActivity(i)
        }
    }
}