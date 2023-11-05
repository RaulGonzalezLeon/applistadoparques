package com.example.applistadoparques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.applistadoparques.databinding.ItemParqueBinding
import com.example.applistadoparques.parques

class ParquesViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemParqueBinding.bind(view)
    fun render(parquesModel: parques){
        binding.nombreParque.text= parquesModel.nombre
        binding.descripcion.text= parquesModel.descripcion
        Glide.with(binding.imagen.context).load(parquesModel.imagen).into(binding.imagen)

        binding.imagen.setOnClickListener{Toast.makeText(binding.imagen.context,parquesModel.nombre,
            Toast.LENGTH_SHORT).show()}
    }
}