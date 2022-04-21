package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var diceImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button:Button=findViewById(R.id.roll_button)
        button.setOnClickListener{
            //Toast.makeText(this,"Show toast",Toast.LENGTH_SHORT).show()
            changeImage()
        }
        diceImage=findViewById(R.id.roll_image)

    }

    private fun changeImage() {
        val randomNumber= Random.nextInt(6)+1

        val drawableReasource=when(randomNumber){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableReasource)
    }
}