package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.addTextChangedListener


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var user = findViewById<EditText>(R.id.user)
        var password = findViewById<EditText>(R.id.password)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            //Toast.makeText(this, "Hello! I'm a text", Toast.LENGTH_LONG).show()
           var intent = Intent(this,activity_second::class.java)
            var bundle = Bundle()
            intent.putExtra("user",user.text.toString())

            startActivity(intent)
        }

        password.addTextChangedListener {
            if(it?.length?:0 > 9){
                password.setError("No ingrese más de 10 digitos")
            }
        }
    }
}