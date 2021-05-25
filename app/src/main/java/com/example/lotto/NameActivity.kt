package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnGoName = findViewById<Button>(R.id.btnGO_Name)
        btnGoName.setOnClickListener{
            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

        btnBack.setOnClickListener{
            finish()
        }
    }
}