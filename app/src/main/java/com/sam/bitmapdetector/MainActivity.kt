package com.sam.bitmapdetector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private val historicalList = HistoricalList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button_1)
        val button2 = findViewById<Button>(R.id.button_2)
        val button3 = findViewById<Button>(R.id.button_3)
        val button4 = findViewById<Button>(R.id.button_4)
        val button5 = findViewById<Button>(R.id.button_5)

        button1.setOnClickListener { historicalList.select(Effect(1, "音效 1")) }
        button2.setOnClickListener { historicalList.select(Effect(2, "音效 2")) }
        button3.setOnClickListener { historicalList.select(Effect(3, "音效 3")) }
        button4.setOnClickListener { historicalList.select(Effect(4, "音效 4")) }
        button5.setOnClickListener { historicalList.select(Effect(5, "音效 5")) }
    }

}