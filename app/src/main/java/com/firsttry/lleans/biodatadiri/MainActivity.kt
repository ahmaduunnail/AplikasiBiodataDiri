package com.firsttry.lleans.biodatadiri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById<Button>(R.id.lanjut)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity2 :: class.java)
            startActivity(intent)
        }
    }
}