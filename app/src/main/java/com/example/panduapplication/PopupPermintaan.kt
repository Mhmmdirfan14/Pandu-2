package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class PopupPermintaan : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.popup_permintaan, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnSelesai: Button = view.findViewById(R.id.btn_selesai_permintaan)
        btnSelesai.setOnClickListener(this)

        val btnPeriksa: Button = view.findViewById(R.id.btn_periksa_permintaan)
        btnPeriksa.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_selesai_permintaan){
            val fragmentAdministratif= FragmentAdministratif()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentAdministratif, FragmentAdministratif::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }

        if(v?.id == R.id.btn_periksa_permintaan){
            val fragmentAdministratifTunggu= FragmentAdministratifTunggu()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentAdministratifTunggu, FragmentAdministratifTunggu::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }

}