package com.example.nabila_next_xml

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext: Button = findViewById(R.id.Button)
        val btnShare: Button = findViewById(R.id.Button2)

        btnNext.setOnClickListener {
            val intent = Intent(this, activity_main2::class.java)
            startActivity(intent)
        }
        btnShare.setOnClickListener {
            val intent = Intent(this, activity_main3::class.java)
            startActivity(intent)
        }
    }
}

