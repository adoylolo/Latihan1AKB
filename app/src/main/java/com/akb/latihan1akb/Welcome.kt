package com.akb.latihan1akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Welcome : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val intent = Intent(this, LoginCode::class.java)
            startActivity(intent)
        }
    }
}

/*
* Tanggal Pengerjaan  : 03-April-2020 ~ 07-April-2020
* Deskripsi Pekerjaan : Membuat kelas Welcome (Main Activity), LoginCode, Biodaa, Sayhai dan layout activity_main,
*                       activity_login_code, activity_biodata, activity_sayhai.
*                       membuat fungsi untuk pindah dari activity ke activity lain.
*                       Membuat validasi untuk Kode Keluarga agar tidak kosong dan harus 6 digit.
*                       Membuat validasi untuk nama dan umur agar tidak kosong.
* NIM                 : 10117145
* Nama                : Muhammad Farhaan
* Kelas               : IF-4
* */