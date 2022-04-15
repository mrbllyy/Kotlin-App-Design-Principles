package com.example.tasarmodevi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.core.widget.ImageViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_next = findViewById<Button>(R.id.button_next)

        button_next.setOnClickListener {
            //Toast.makeText(this, "Next Button Clicked!", Toast.LENGTH_SHORT).show()
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.kristopher_roller)
            findViewById<TextView>(R.id.textView3).setText(R.string.content_description2)
            findViewById<TextView>(R.id.textView5).setText(R.string.price2)
        }

        val button_prev = findViewById<Button>(R.id.button_prev)

        button_prev.setOnClickListener {
            //Toast.makeText(this, "Prev Button Clicked!", Toast.LENGTH_SHORT).show()
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.johannes_groll)
            findViewById<TextView>(R.id.textView3).setText(R.string.content_description)
            findViewById<TextView>(R.id.textView5).setText(R.string.price)
        }
    }

}