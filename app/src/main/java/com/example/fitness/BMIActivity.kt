package com.example.fitness

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BMIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)

        val height=findViewById<EditText>(R.id.etHeight)
        val weight=findViewById<EditText>(R.id.etWeight)
        val btnCalc=findViewById<Button>(R.id.btnBMI)
        val textResult=findViewById<TextView>(R.id.tvResult)

        btnCalc.setOnClickListener() {
            val h=(height.text.toString()).toFloat()/100
            val w=(weight.text.toString()).toFloat()

            val r=(w/(h*h))
            val rInt=r.toInt()

            if(r<18.5) {
                textResult.text="BMI-$rInt\nEat Something you skinny AF"
            } else if(r>18.5 && r<24.9) {
                textResult.text="BMI-$rInt\nCongratulations you have Healthy BMI"
            } else if(r>15 && r<29.9) {
                textResult.text="BMI-$rInt\nGet a Gym membership you Overweight"
            } else if(r>30) {
                textResult.text="BMI-$rInt\nStop Eating you Obese AF"
            }
        }
    }
}