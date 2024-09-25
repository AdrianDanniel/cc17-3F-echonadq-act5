package com.example.artapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val image1: ImageView = findViewById(R.id.image1)
        val description1: TextView = findViewById(R.id.description1)


        image1.setOnClickListener {
            Toast.makeText(this, "This is Artwork 1", Toast.LENGTH_SHORT).show()
        }


    }
}
