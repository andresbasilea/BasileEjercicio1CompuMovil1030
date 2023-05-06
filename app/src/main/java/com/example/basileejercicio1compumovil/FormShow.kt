package com.example.basileejercicio1compumovil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class FormShow : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_show)
        supportActionBar?.hide()
//        thread {
//            Thread.sleep(5000)
//        }
    }
}