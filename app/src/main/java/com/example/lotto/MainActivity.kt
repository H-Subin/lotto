package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cv_Constell = findViewById<CardView>(R.id.cardview_Constellation)

        cv_Constell.setOnClickListener{
            val intent = Intent(this, ConstellationActivity::class.java)
            startActivity(intent)
        }

    }
}