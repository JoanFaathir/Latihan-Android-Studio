package com.xirpl1.latihanjoanpertama

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var etEmail: EditText
    lateinit var etPassword : EditText
    lateinit var email: String
    lateinit var password : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_linear)

        btnLogin = findViewById(R.id.btn_login)
        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_password)

        btnLogin.setOnClickListener {
            email = etPassword.text.toString()
            password = etPassword.text.toString()

            if (email.isNullOrEmpty() && password.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Email atau Password masih kosong", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Selamat ! Email dan Password sudah terisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}