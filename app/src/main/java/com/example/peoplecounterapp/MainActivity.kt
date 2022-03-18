package com.example.peoplecounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var timesClicked=0
        val ClickMeButton=findViewById<Button>(R.id.myButton)
        val ClickMeText=findViewById<TextView>(R.id.textView)
        ClickMeButton.setOnClickListener{
            ClickMeText.text=timesClicked.toString()
            timesClicked+=1

            Toast.makeText(this,"EK AUR BAAR CLICK KAR LIYA",Toast.LENGTH_SHORT).show()
        }


            }
}