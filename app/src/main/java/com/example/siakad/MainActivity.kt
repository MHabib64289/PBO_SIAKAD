package com.example.siakad

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            val navController = findNavController(R.id.nav_host_fragment)
            navController.navigate(R.id.action_FirstFragment_to_SecondFragment)
        }, 2000) // Delay 2 detik
    }
}
