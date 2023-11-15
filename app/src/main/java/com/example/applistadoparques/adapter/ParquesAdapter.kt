package com.example.applistadoparques.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applistadoparques.ParquesProvider.Companion.parquesList
import com.example.applistadoparques.R
import com.example.applistadoparques.parques

class ParquesAdapter(private var parquesList:List<parques>): RecyclerView.Adapter<ParquesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParquesViewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        return ParquesViewHolder(layoutInflater.inflate(R.layout.item_parque,parent,false))
    }

    override fun getItemCount(): Int {
        return parquesList.size
    }

    override fun onBindViewHolder(holder: ParquesViewHolder, position: Int) {
        val item = parquesList[position]
        holder.render(item)
    }
    fun actualizarParques(listaparque: List<parques>) {
        this.parquesList = listaparque
        notifyDataSetChanged()
    }

}