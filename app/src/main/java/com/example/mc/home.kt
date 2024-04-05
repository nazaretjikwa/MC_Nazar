package com.example.mc

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class home : AppCompatActivity() {

    private lateinit var filmRecyclerView: RecyclerView
    private lateinit var filmJudul: Array<String>
    private lateinit var filmDirector: Array<String>
    private lateinit var filmGender: Array<String>
    private lateinit var filmActor: Array<String>
    private lateinit var filmGambar: Array<Int>
    private lateinit var filmSinopsis: Array<String>
    private lateinit var listFilm: ArrayList<DataFilm>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        filmGambar = arrayOf(
            R.drawable.av,
            R.drawable.bat,
            R.drawable.blac,
            R.drawable.iron,
            R.drawable.gr,
            R.drawable.cp,
            R.drawable.pool
        )

        filmJudul = arrayOf(
            "Batman dan avatar",
            "Batman dan avatar",
            "Batman dan avatar",
            "Batman dan avatar",
            "Batman dan avatar",
            "Batman dan avatar",
            "Batman dan avatar"
        )
        filmDirector = arrayOf(
            "Marvel disney ",
            "Marvel disney ",
            "Marvel disney ",
            "Marvel disney ",
            "Marvel disney ",
            "Marvel disney ",
            "Marvel disney "

        )

        filmActor = arrayOf(
            "James Cameroon",
            "James Cameroon",
            "James Cameroon",
            "James Cameroon",
            "James Cameroon",
            "James Cameroon",
            "James Cameroon"
        )

        filmGender = arrayOf(
            "Actioon comiand",
            "Actioon comiand",
            "Actioon comiand",
            "Actioon comiand",
            "Actioon comiand",
            "Actioon comiand",
            "Actioon comiand"

        )

        filmSinopsis = arrayOf(
            getString(R.string.av),
            getString(R.string.cp) ,
            getString(R.string.bat) ,
            getString(R.string.spid) ,
            getString(R.string.gr) ,
            getString(R.string.blac) ,
            getString(R.string.pool)

        )

        filmRecyclerView = findViewById(R.id.filmList)
        filmRecyclerView.layoutManager = LinearLayoutManager(this)

        listFilm = arrayListOf<DataFilm>()
        getData()

    }

    private fun getData() {
        for (i in filmGambar.indices) {
            val hasilFilm = DataFilm(filmGambar[i], filmJudul[i])
            listFilm.add(hasilFilm)
        }

        var adapter = madapter(listFilm)
        filmRecyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : madapter.onItemClickListener {
            override fun onItemClick(position: Int) {
                val intent = Intent(this@home, Deskripsi::class.java)
                intent.putExtra("idImage", listFilm[position].gambar)
                intent.putExtra("idJdl", listFilm[position].judul)

                intent.putExtra("idDirektor",filmDirector [position])
                intent.putExtra("dtActor", filmActor[position])
                intent.putExtra("idGender",filmGender [position])
                intent.putExtra("idSynopsis",filmSinopsis [position])
                startActivity(intent)


            }

        })

    }
}