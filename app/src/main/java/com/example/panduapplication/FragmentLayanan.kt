package com.example.panduapplication

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import com.example.panduapplication.databinding.FragmentAdministratifBinding

class FragmentLayanan : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_layanan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnPengaduan1:Button = view.findViewById(R.id.btn_buat_laporan)
        btnPengaduan1.setOnClickListener(this)

        val tvAdministratif:TextView = view.findViewById(R.id.tvAdministratif)
        tvAdministratif.setOnClickListener(this)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

        val btnTungguPengaduan: Button = view.findViewById(R.id.btn_tunggu)
        btnTungguPengaduan.setOnClickListener(this)

        val btnProsesPengaduan: Button = view.findViewById(R.id.btn_proses)
        btnProsesPengaduan.setOnClickListener(this)

        val btnSelesaiPengaduan: Button = view.findViewById(R.id.btn_selesai)
        btnSelesaiPengaduan.setOnClickListener(this)
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_buat_laporan){
            val fragmentpengaduan1 = FragmentPengaduan1()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentpengaduan1, FragmentPengaduan1::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.tvAdministratif){
            val fragmentadministratif = FragmentAdministratif()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentadministratif, FragmentAdministratif::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

        if(v?.id == R.id.btn_tunggu){
            val tungguPengaduan= TungguPengaduan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, tungguPengaduan, TungguPengaduan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_proses){
            val prosesPengaduan= ProsesPengaduan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, prosesPengaduan, ProsesPengaduan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_selesai){
            val selesaiPengaduan= SelesaiPengaduan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, selesaiPengaduan, SelesaiPengaduan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
    }



}