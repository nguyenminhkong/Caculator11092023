package com.example.caculator11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.viewmodel.viewModelFactory

class MainActivity : AppCompatActivity() {
    //Global scope
    private lateinit var edtNumber1: EditText
    private lateinit var edtNumber2: EditText
    private lateinit var textViewresult: TextView
    private lateinit var btnplus: Button
    private lateinit var btnminos: Button
    private lateinit var btnmultiplication: Button
    private lateinit var btndivision: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtNumber1 = findViewById(R.id.edit_text_number1)
        edtNumber1.setText("")
        edtNumber2 = findViewById(R.id.edit_text_number2)
        edtNumber2.setText("")
        textViewresult = findViewById(R.id.edit_text_result)
        textViewresult.setText("")
        btnplus = findViewById(R.id.button_plus)
        btnminos = findViewById(R.id.button_minus)
        btnmultiplication = findViewById(R.id.button_multiplication)
        btndivision = findViewById(R.id.button_division)
        btnplus.setOnClickListener {
            val textNumber1 = edtNumber1.text.toString()
            val textNumber2 = edtNumber2.text.toString()
            if (textNumber1.isBlank() || textNumber2.isBlank()) {
                Toast.makeText(this@MainActivity, "Input invalid", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val number1 = textNumber1.toInt()
            val number2 = textNumber2.toInt()
            val result = number1 + number2
            val textDisplay = "$number1 + $number2 = $result"
            textViewresult.text = textDisplay
        }
        btnminos.setOnClickListener {
            val textNumber1 = edtNumber1.text.toString()
            val textNumber2 = edtNumber2.text.toString()
        }
    }
}