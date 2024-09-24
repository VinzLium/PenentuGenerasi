package com.fli.penentugenerasi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //mulai komponen
        var edTglLahir = findViewById<EditText>(R.id.ed_tanggal_lahir)
        var btnKlik = findViewById<Button>(R.id.btn_tglLahir)
        var tvHasil = findViewById<TextView>(R.id.tv_hasil)

        btnKlik.setOnClickListener {
            val input = edTglLahir.text.toString().toInt()
            val hasil = when (input.toInt()) {
                in 1924..1945 -> "Baby Boomers"
                in 1946..1964 -> "X"
                in 1965..1980 -> "Millenials"
                in 1981..1996 -> "Z"
                in 1997..2012 -> "Alpha"
                in 2013..2024 -> "Beta"
                else -> "Tidak Ditemukan"
            }
            tvHasil.text = "Kamu Generasi $hasil"
            }
        }
    }