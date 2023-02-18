package com.simform.gitpractice

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Initialization
    lateinit var email: EditText
    lateinit var pass: EditText
    lateinit var login: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //Login Code
        email = findViewById(R.id.EmailAddressText)
        pass = findViewById(R.id.passwordText)
        login = findViewById(R.id.loginbtn)
        login.setOnClickListener {
            if (email.text.contains("parth") && pass.text.contains("parth")) {
                Toast.makeText(applicationContext, "logged in ", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "not logged in ", Toast.LENGTH_SHORT).show()
            }
        }
    }
        //Login Error code commit 1
        //Login Error code commit 2
        //Login Error code commit 3


    }
