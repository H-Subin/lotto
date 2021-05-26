package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList

fun getRandomLottoNumber(): Int {
    return Random().nextInt(45) + 1
}

fun getRandomLottoNumbers(): MutableList<Int> {
    val lottoNumbers = mutableListOf<Int>()

    while (true) {
        var number: Int = getRandomLottoNumber()

        if (lottoNumbers.contains(number)) {
            continue
        }
        lottoNumbers.add(number)
        if (lottoNumbers.size >= 6)
            break;
    }
    return lottoNumbers

}

fun getShuffledLottoNumbers() : MutableList<Int>{
    val list = mutableListOf<Int>()
    for(number in 1..45){
        list.add(number)
    }
    list.shuffle()

    return list.subList(0,6)
}


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var cv_Constell = findViewById<CardView>(R.id.cardview_Constellation)
        var cv_Name = findViewById<CardView>(R.id.cardview_Name)
        var cv_Random = findViewById<CardView>(R.id.cardview_Random)

        cv_Random.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }

        cv_Constell.setOnClickListener {
            val intent = Intent(this, ConstellationActivity::class.java)
            startActivity(intent)
        }

        cv_Name.setOnClickListener {
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        }



    }


}