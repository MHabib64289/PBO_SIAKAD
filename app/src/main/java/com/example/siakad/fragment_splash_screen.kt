package com.example.siakad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import android.os.Handler
import android.os.Looper




class fragment_splash_screen : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Bisa pakai delay, animasi, atau tombol untuk trigger
        Handler(Looper.getMainLooper()).postDelayed({
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }, 2000) // contoh delay 2 detik
    }
}