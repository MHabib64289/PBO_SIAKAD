package com.example.siakad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.siakad.databinding.FragmentLoginBinding

class fragment_login : Fragment() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        usernameEditText = view.findViewById(R.id.usernameText)
        passwordEditText = view.findViewById(R.id.passwordTeks)
        loginButton = view.findViewById(R.id.login_button)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isNotEmpty() && password.isNotEmpty()) {
                // Ganti fragment ke fragment_beranda (pastikan sudah dibuat)
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, fragment_beranda())
                    .addToBackStack(null)
                    .commit()// supaya tidak bisa kembali ke login dengan tombol back
            } else {
                Toast.makeText(requireContext(), "Isi username dan password", Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}








