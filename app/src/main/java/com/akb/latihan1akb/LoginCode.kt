package com.akb.latihan1akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login_code.*

class LoginCode : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_code)

        button2.setOnClickListener {

            val kode = input1.text.toString()

            if (kode.isEmpty())
            {
                Toast.makeText(this, "Kolom Tidak Boleh Dikosongkan", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (kode.length != 6){
                Toast.makeText(this, "Kode Harus 6 Huruf/Angka", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}
