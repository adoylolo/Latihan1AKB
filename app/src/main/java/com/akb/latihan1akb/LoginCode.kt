package com.akb.latihan1akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_code.*

class LoginCode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_code)

        button2.setOnClickListener {
            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}
