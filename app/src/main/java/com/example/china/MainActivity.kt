package com.example.china

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_next: Button = findViewById(R.id.btn_next)
        btn_next.setOnClickListener {
            val nameText = findViewById<EditText>(R.id.name)
            val name = nameText.text.toString()
            val goScreen2 = Intent(this, Screen2::class.java).also {
                it.putExtra("username", name)
                startActivity(it)
            }


        }

    }

}

