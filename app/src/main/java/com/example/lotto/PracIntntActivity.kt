package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PracIntntActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prac_intnt)

        val btnMain = findViewById<Button>(R.id.btnMain)
        val btnConstellation = findViewById<Button>(R.id.btnConstellation)
        val btnName = findViewById<Button>(R.id.btnName)
        val btnReslt = findViewById<Button>(R.id.btnResult)

        btnMain.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
        btnConstellation.setOnClickListener{
            startActivity(Intent(this, ConstellationActivity::class.java))
        }
        btnName.setOnClickListener{
            startActivity(Intent(this, NameActivity::class.java))
        }
        btnReslt.setOnClickListener{
            startActivity(Intent(this, ResultActivity::class.java))
        }
    }
}