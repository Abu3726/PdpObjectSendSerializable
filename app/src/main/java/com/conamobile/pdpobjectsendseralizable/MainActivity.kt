package com.conamobile.pdpobjectsendseralizable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.conamobile.pdpobjectsendseralizable.model.User

class MainActivity : AppCompatActivity() {
    lateinit var button:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val user = User(name = "Nurmuhammad", age = "17")
            openDetailActivity(user)
        }

    }

    private fun openDetailActivity(user: User) {
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("user",user)
        startActivity(intent)
    }
}