package com.example.appg

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clothingCard = findViewById<CardView>(R.id.clothingCard)
        clothingCard.setOnClickListener {
            val intent = Intent(this@MainActivity, ClothingActivity::class.java)
            startActivity(intent)
        }

        val electronics = findViewById<CardView>(R.id.electronicsCard)
        electronics.setOnClickListener {
            val intent = Intent(this@MainActivity, ElectronicsActivity::class.java)
            startActivity(intent)

        }

        val home = findViewById<CardView>(R.id.HomeCard)
        home.setOnClickListener {
            val intent = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(intent)

        }

        val beauty = findViewById<CardView>(R.id.Beauty)
        beauty.setOnClickListener {
            val intent = Intent(this@MainActivity, BeautyActivity::class.java)
            startActivity(intent)
        }

        val pharmacy = findViewById<CardView>(R.id.pharmacy)
        pharmacy.setOnClickListener {
            val intent = Intent(this@MainActivity, PharmacyActivity::class.java)
            startActivity(intent)
        }

        val groceries = findViewById<CardView>(R.id.grocieries)
        groceries.setOnClickListener {
            val intent = Intent(this@MainActivity, GroceriesActivity::class.java)
            startActivity(intent)
        }
    }
}