package com.example.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button // import button
import android.widget.Toast // notificatation
import android.widget.TextView // import text
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
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

