package com.akb.latihan1akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_biodata.*

class Biodata : AppCompatActivity() {

    lateinit var Nama : EditText
    lateinit var Btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_biodata)

        Nama = findViewById(R.id.nama)
        Btn = findViewById(R.id.button4)

        Btn.setOnClickListener {
            var name = Nama.text.toString()

            val intent = Intent(this, Sayhai::class.java)
            intent.putExtra("Nama", name)
            startActivity(intent)
        }

    }
}
