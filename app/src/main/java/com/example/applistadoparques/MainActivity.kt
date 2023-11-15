package com.example.applistadoparques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.applistadoparques.adapter.ParquesAdapter
import com.example.applistadoparques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        var adapter = ParquesAdapter(ParquesProvider.parquesList)
        binding.recycler.adapter = adapter

        binding.filtro.addTextChangedListener {filtro ->
            val filtroParque = ParquesProvider.parquesList.filter { parque ->
                parque.nombre.lowercase().contains(filtro.toString().lowercase())  }
            adapter.actualizarParques(filtroParque)
        }


    }

}