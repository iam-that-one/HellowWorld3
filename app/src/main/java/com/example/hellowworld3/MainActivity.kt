package com.example.hellowworld3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var input : EditText
    lateinit var action : Button

    lateinit var myText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myText = findViewById(R.id.tvMyText)
        myText.text = "Abdullah"
        input = findViewById(R.id.editTextTextPersonName2)
        action = findViewById(R.id.button2)
        action.setOnClickListener{add()}
    }

    fun add(){

        var students = arrayListOf<String>()
        students.add(input.text.toString())
        println(students)
    }
}