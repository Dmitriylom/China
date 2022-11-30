package com.example.china

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

val idChina = listOf(
    "几点了？ [jǐ diǎn liǎo？] Чи Диан Лиао",
    "怎么了？ [zěnme liǎo] Зенми Лиао"
)
val idRus = listOf(
    "Сколько время?",
    "Как дела?"
)
private var index = 0
class Screen4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)
        val btnClose: Button = findViewById(R.id.btn_close)
        btnClose.setOnClickListener {
            val goBackScreen3 = Intent(this, Screen3::class.java)
            startActivity(goBackScreen3)
        }
        val next = findViewById<Button>(R.id.btn_next_phrases)
        val textChina = findViewById<TextView>(R.id.textChina)
        val textRus = findViewById<TextView>(R.id.textRus)
        next.setOnClickListener {
            if (index > 1) index = 0
            textChina.setText(idChina[index])
            textRus.setText(idRus[index])
            index ++

        }
        val back = findViewById<Button>(R.id.btn_back)
        back.setOnClickListener {
            textChina.setText(R.string.china_language_phrases1)
            textRus.setText(R.string.translate_phrases1)
        }
    }
}