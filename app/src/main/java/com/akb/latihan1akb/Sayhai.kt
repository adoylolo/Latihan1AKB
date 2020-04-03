package com.akb.latihan1akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_sayhai.*

class Sayhai : AppCompatActivity() {

    lateinit var Text : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayhai)

        var intent = intent
        val text = intent.getStringExtra("Nama")

        val hasil = findViewById<TextView>(R.id.textakhir)
        hasil.text = "Beres! Sekarang "+text+" udah bisa ngecek penggunaan HP "+text+" tiap hari buat bantu "+text+" ngatur waktu :)"


        button5.setOnClickListener {
            val intent = Intent(this, Welcome::class.java)
            startActivity(intent)
        }
    }
}
