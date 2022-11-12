package com.example.cviceni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


lateinit var button :Button
lateinit var textView: TextView
lateinit var editTextNumber: EditText

var cislo =0


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        editTextNumber = findViewById(R.id.editTextNumber)

        textView.text=""
        button.setOnClickListener()
        {
            cislo = editTextNumber.text.toString().toInt()
            if (cislo % 3 ==0 && cislo % 5 !=0)
            {
                textView.text ="Fizz"
            }
           else if(cislo % 5 ==0 && cislo % 3 !=0)
            {
                textView.text ="Buzz"
            }
            else if(cislo % 3 == 0 && cislo % 5 == 0)
            {
                textView.text = "FizzBuzz"
            }
            else{
                textView.text ="Cislo neni delitelne 3 ani 5"
            }
        }
    }
}