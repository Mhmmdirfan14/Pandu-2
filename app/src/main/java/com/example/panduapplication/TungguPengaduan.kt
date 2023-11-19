package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class TungguPengaduan : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tunggu_pengaduan, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvDetailTungguPengaduan: TextView = view.findViewById(R.id.tv_detail_tunggu_pengaduan)
        tvDetailTungguPengaduan.setOnClickListener(this)

        val btnBuat: Button = view.findViewById(R.id.btn_buat)
        btnBuat.setOnClickListener(this)

        val btnProses: Button = view.findViewById(R.id.btn_proses)
        btnProses.setOnClickListener(this)

        val btnSelesai: Button = view.findViewById(R.id.btn_selesai)
        btnSelesai.setOnClickListener(this)

        val tvAdministratif:TextView = view.findViewById(R.id.tvAdministratif)
        tvAdministratif.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.tv_detail_tunggu_pengaduan){
            val detailTungguPengaduan= DetailTungguPengaduan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, detailTungguPengaduan, DetailTungguPengaduan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_buat){
            val fragmentLayanan= FragmentLayanan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentLayanan, FragmentLayanan::class.java.simpleName)
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

        if(v?.id == R.id.tvAdministratif){
            val fragmentadministratif = FragmentAdministratif()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentadministratif, FragmentAdministratif::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }

}