package com.conamobile.pdpobjectsendseralizable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var namet:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        namet = findViewById(R.id.name2)
        var user = intent.getSerializableExtra("user")

        namet.text = user.toString()

    }
}