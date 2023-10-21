package com.ronny.appnews

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ProgressBar
import com.ronny.appnews.R.*


class StartActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_start)

        val progressBar = findViewById<ProgressBar>(id.progressBar)
        progressBar.max = 100
        val currentProgress = 600

        // HAcer que la barra de progreso se llene en 3 segundos y despues se cierra la actividad
        ObjectAnimator.ofInt(progressBar, "progress", currentProgress)
            .setDuration(3000)
            .start()

        // Usar Handler para retrasar la transición a MainActivity por 2 segundos (2000 milisegundos)
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, LoginPersonActivity::class.java)
            startActivity(intent)
            finish() // Cierra la actividad actual
        }, 5000) // Cambiar 5000 a 2000 para que termine en 2 segundos






    }
}