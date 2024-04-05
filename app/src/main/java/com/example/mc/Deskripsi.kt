package com.example.mc

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Deskripsi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deskripsi)

        val gambar : ImageView = findViewById(R.id.imgF)
        val judul : TextView = findViewById(R.id.jdlFilm)
        val direktor : TextView = findViewById(R.id.Director)
        val actor : TextView = findViewById(R.id.Actor)
        val gender : TextView = findViewById(R.id.Gender)
        val sinopsis : TextView = findViewById(R.id.synopsis)


        val bundle: Bundle?= intent.extras
        val bJudul = bundle!!.getString("idJdl")
        val bGambar = bundle.getInt("idImage")
        val  bDirektor = bundle.getString("idDirektor")
        val bActor = bundle.getString("dtActor")
        val bGender = bundle.getString("idGender")
        val bSynnopsis = bundle.getString("idSynopsis")

        gambar.setImageResource(bGambar)
        judul.text = bJudul
        direktor.text = bDirektor
        actor.text = bActor
        gender.text = bGender
        sinopsis.text = bSynnopsis

    }
}