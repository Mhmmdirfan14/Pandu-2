package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 49a6c03 (final-project)

class FragmentPermintaan1 : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }
<<<<<<< HEAD
=======
=======
import android.widget.Button

class FragmentPermintaan1 : Fragment(), View.OnClickListener {
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_permintaan1, container, false)
    }

<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnKirim: Button = view.findViewById(R.id.btn_kirim)
        btnKirim.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_kirim){
            val popupPermintaan= PopupPermintaan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, popupPermintaan, PopupPermintaan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }

>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
}