package com.example.applistadoparques

import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.applistadoparques.databinding.ActivityAnadirParqueBinding

class ActivityWithMenus : AppCompatActivity() {
    companion object{
        var actividadActual = 0;
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
            inflater.inflate(R.menu.menu_principal,menu)


        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.inicio -> {
                /* Hacemos que se abra la pantalla del listado de parques */
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                true
            }
            R.id.anadir_parque -> {
                val intent = Intent(this, AnadirParqueActicity::class.java)
                startActivity(intent)
                true

            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}