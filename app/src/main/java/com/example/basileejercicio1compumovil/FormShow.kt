package com.example.basileejercicio1compumovil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.os.Build
import kotlin.concurrent.thread
import com.example.basileejercicio1compumovil.databinding.ActivityFormShowBinding

class FormShow : AppCompatActivity() {



    private lateinit var binding: ActivityFormShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_form_show)
        supportActionBar?.hide()
        binding = ActivityFormShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        thread {
//            Thread.sleep(5000)
//        }


        val bundle = intent.extras

        if (bundle != null) {
            val student: Student? = bundle.getParcelable("student")


//            var student: Student? = null
//
//            student = if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.TIRAMISU){
//                bundle.getParcelable<Student>("student", student::class.java)
//            }else{
//                bundle.getParcelable<Student>("student")
//            }

            if (student != null) {
                binding.tvNombrecompleto2.text = "${student.nombre} ${student.apellidos}"
                binding.tvNumCuenta2.text = "${student.numCuenta}"
                binding.tvEdad2.text = resources.getQuantityString(R.plurals.edadR,student.edad,student.edad)
                binding.tvSignozodiacal2.text = "${student.signo}"
                binding.tvSignozodiacalchino2.text = "${student.signoChino}"
                binding.tvCorreo2.text = "${student.correo}"


                val carreraImageResId = when (student.carrera) {
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