package com.example.caculator11092023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    //Global scope
    private lateinit var edtNumber1: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Local scope
        //Lay gia tri ra tu resource
        //Ánh xạ
        edtNumber1 = findViewById(R.id.edit_text_number1)
        edtNumber1.setText("Text")
    }
}