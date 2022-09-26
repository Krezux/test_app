package com.example.test_app

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textMain = findViewById(R.id.text_Main) as TextView
        val button_click = findViewById(R.id.button_TextChange) as Button

        button_click.setOnClickListener {//  code to perform when the user clicks on the button

            Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
            textMain.setText("Text Changed.")
        }
    }
}

