package com.akb.latihan1akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_biodata.*

class Biodata : AppCompatActivity() {

    lateinit var Nama : EditText
    lateinit var Umur : EditText
    lateinit var Btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        Nama = findViewById(R.id.nama)
        Umur = findViewById(R.id.umur)
        Btn = findViewById(R.id.button4)

        Btn.setOnClickListener {
            var name = Nama.text.toString()
            var age = Umur.text.toString()

            if (name.isEmpty())
            {
                Toast.makeText(this, "Nama Tidak Boleh Dikosongkan", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (age.isEmpty())
            {
                Toast.makeText(this, "Umur Tidak Boleh Dikosongkan", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val intent = Intent(this, Sayhai::class.java)
            intent.putExtra("Nama", name)
            startActivity(intent)
        }

    }
}
