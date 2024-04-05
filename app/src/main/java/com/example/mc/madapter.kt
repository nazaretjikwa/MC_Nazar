package com.example.mc

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class madapter(private val namaList: ArrayList<DataFilm>):RecyclerView.Adapter<madapter.MyViewHolder>(){
    private lateinit var mListener: onItemClickListener

    interface  onItemClickListener{
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mListener = listener
    }

    class MyViewHolder(filmView: View, listener: onItemClickListener) : RecyclerView.ViewHolder(filmView){
        val imgFilm:ImageView = filmView.findViewById(R.id.imgFilm)
        val jdlFillm:TextView = filmView.findViewById(R.id.jdl)


        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  itemView = LayoutInflater.from(parent.context).inflate(R.layout.hm,parent, false)
        return MyViewHolder(itemView, mListener)
    }

    override fun getItemCount(): Int {
        return namaList.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = namaList[position]
        holder.imgFilm.setImageResource(currentItem.gambar)
        holder.jdlFillm.text = currentItem.judul

    }


}