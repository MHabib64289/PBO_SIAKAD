package com.example.siakad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.siakad.databinding.FragmentLoginBinding // Pastikan import ini tidak di-comment

class fragment_login : Fragment() {

    // Deklarasikan variabel binding
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Setup View Binding
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButton.setOnClickListener {
            // Akses view melalui binding, lebih aman
            val username = binding.usernameText.text.toString()
            val password = binding.passwordTeks.text.toString()

            // Contoh validasi login sederhana
            if (username == "admin" && password == "12345") {
                // GUNAKAN findNavController dengan action yang sudah dibuat di nav_graph
                findNavController().navigate(R.id.action_login_to_beranda)

            } else if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(requireContext(), "Username dan password harus diisi", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(requireContext(), "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Hindari memory leak dengan membersihkan binding
        _binding = null
    }
}