package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class PopupLaporan : Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.popup_laporan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSelesaiLaporan: Button = view.findViewById(R.id.btn_selesai_laporan)
        btnSelesaiLaporan.setOnClickListener(this)

        val btnPeriksaPengaduan: Button = view.findViewById(R.id.btn_periksa_pengaduan)
        btnPeriksaPengaduan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_selesai_laporan){
            val fragmentLayanan= FragmentLayanan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentLayanan, FragmentLayanan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_periksa_pengaduan){
            val tungguPengaduan= TungguPengaduan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, tungguPengaduan, TungguPengaduan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }


}