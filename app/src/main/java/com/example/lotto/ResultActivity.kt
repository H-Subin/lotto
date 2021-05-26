package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result") ?: return

        val result_sored = result?.sorted()

        val lottoBallImageStartId = R.drawable.ball_01

        val imageview1 = findViewById<ImageView>(R.id.imageView1)
        val imageview2 = findViewById<ImageView>(R.id.imageView2)
        val imageview3 = findViewById<ImageView>(R.id.imageView3)
        val imageview4 = findViewById<ImageView>(R.id.imageView4)
        val imageview5 = findViewById<ImageView>(R.id.imageView5)
        val imageview6 = findViewById<ImageView>(R.id.imageView6)

        imageview1.setImageResource(lottoBallImageStartId + result_sored!![0] - 1)
        imageview2.setImageResource(lottoBallImageStartId + result_sored[1] - 1)
        imageview3.setImageResource(lottoBallImageStartId + result_sored[2] - 1)
        imageview4.setImageResource(lottoBallImageStartId + result_sored[3] - 1)
        imageview5.setImageResource(lottoBallImageStartId + result_sored[4] - 1)
        imageview6.setImageResource(lottoBallImageStartId + result_sored[5] - 1)




    }
}