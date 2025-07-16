package com.example.siakad

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.fragment.findNavController
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint


class fragment_beranda : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Hubungkan layout dengan ID masing-masing menu
        val profil = view.findViewById<LinearLayout>(R.id.profil)
        val jadwal = view.findViewById<LinearLayout>(R.id.jadwal)
        val absen = view.findViewById<LinearLayout>(R.id.absen)
        val krs = view.findViewById<LinearLayout>(R.id.krs)
        val pembayaran = view.findViewById<LinearLayout>(R.id.pembayaran)
        val nilai = view.findViewById<LinearLayout>(R.id.nilai)
        val tugas = view.findViewById<LinearLayout>(R.id.tugas)


        profil.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_beranda_to_fragment_profile)
        }

        jadwal.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_beranda_to_fragment_jadwal_kuliah)
        }

        absen.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_beranda_to_fragment_absensi)
        }

        krs.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_beranda_to_fragment_krs)
        }

        pembayaran.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_beranda_to_ewallet)
        }

        nilai.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_beranda_to_nilai2)
        }

        tugas.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_beranda_to_tugas2)
        }
    }
}