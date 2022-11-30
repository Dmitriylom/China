package com.example.china

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Screen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        var userName = intent.getStringExtra("username")
        val userNameText = findViewById<TextView>(R.id.userName).apply {
            text = "$userName"
        }


        val btnStart: Button = findViewById(R.id.btn_start)

        btnStart.setOnClickListener {
            val goScreen3 = Intent(this, Screen3::class.java)
            startActivity(goScreen3)
        }
    }
}