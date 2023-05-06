package com.example.basileejercicio1compumovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.annotation.SuppressLint
import kotlin.concurrent.thread
import com.example.basileejercicio1compumovil.databinding.ActivityFormShowBinding

class FormShow : AppCompatActivity() {



    private lateinit var binding: ActivityFormShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_show)
        supportActionBar?.hide()
//        thread {
//            Thread.sleep(5000)
//        }


        val bundle = intent.extras

        if (bundle != null) {
            val persona: Person? = bundle.getParcelable("persona")

            if (persona != null) {
                binding.tvNombrecompleto2.text = "${persona.nombre} ${persona.apellidos}"
                binding.tvEdad2.text = resources.getQuantityString(R.string.edadR, persona.edad, persona.edad) --revosar
                binding.tvSignozodiacal2.text = "${persona.signo}"
                binding.tvSignozodiacalchino2.text = "${persona.signoChino}"
                binding.tvCorreo2.text = "${persona.correo}"
                binding.tvNumCuenta2.text = "${persona.numCuenta}"

                val carreraImageResId = when (persona.carrera) {
                    1 -> R.drawable.ingenieria_aeroespacial
                    2 -> R.drawable.ingenieria_ambiental
                    3 -> R.drawable.ingenieria_civil
                    4 -> R.drawable.ingenieria_computacion
                    5 -> R.drawable.ingenieria_electrica
                    6 -> R.drawable.ingenieria_geofisica
                    7 -> R.drawable.ingenieria_geologica
                    8 -> R.drawable.ingenieria_geomatica
                    9 -> R.drawable.ingenieria_industrial
                    10 -> R.drawable.ingenieria_mecanica
                    11 -> R.drawable.ingenieria_mecatronica
                    12 -> R.drawable.ingenieria_minas
                    13 -> R.drawable.ingenieria_petrolera
                    14 -> R.drawable.ingenieria_biomedica
                    15 -> R.drawable.ingenieria_telecomunicaciones
                    else -> R.drawable.loading2
                }

                binding.ivCarrera.setImageResource(carreraImageResId)
            }
        }


    }







    fun Regresar_click(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }


}