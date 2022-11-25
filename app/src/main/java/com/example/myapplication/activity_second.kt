package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class activity_second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var user = intent.extras?.getString("user")

        Toast.makeText(this,"Welcome " + user +"!",Toast.LENGTH_LONG).show()
    }
}