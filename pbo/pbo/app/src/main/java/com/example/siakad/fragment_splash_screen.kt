package com.example.siakad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

// Jangan lupa untuk menambahkan file layout di sini
// contoh: class fragment_splash_screen : Fragment(R.layout.fragment_splash_screen) {
class fragment_splash_screen : Fragment(R.layout.fragment_splash_screen) { // Ganti dengan nama file layout Anda

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Gunakan lifecycleScope.launch, ini lebih aman dari Handler
        viewLifecycleOwner.lifecycleScope.launch {
            // Tunggu selama 2 detik
            delay(2000)

            // Cek apakah fragment masih aktif sebelum navigasi untuk mencegah crash
            if (isAdded) {
                findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
            }
        }
    }
}