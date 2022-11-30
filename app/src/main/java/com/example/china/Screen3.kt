package com.example.china

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        val btnPhrases: Button = findViewById(R.id.btn_phrases)
        btnPhrases.setOnClickListener {
            val goScreen4 = Intent(this, Screen4::class.java)
            startActivity(goScreen4)
        }
    }
}