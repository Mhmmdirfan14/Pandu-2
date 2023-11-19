package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
import android.widget.Button
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
import android.widget.ImageView
import android.widget.TextView

class FragmentPengaduan1 : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pengaduan1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 49a6c03 (final-project)
        val ivArrowBack:ImageView = view.findViewById(R.id.ivarrow_back)
        ivArrowBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.ivarrow_back){
            val fragmentlayanan = FragmentLayanan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentlayanan, FragmentLayanan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
    }


<<<<<<< HEAD
}
=======
}
=======
        val ivArrowBack: ImageView = view.findViewById(R.id.ivarrow_back)
        ivArrowBack.setOnClickListener(this)

        val btnKirimPengaduan: Button = view.findViewById(R.id.btn_kirim_pengaduan)
        btnKirimPengaduan.setOnClickListener(this)
    }

        override fun onClick(v: View?) {
            if (v?.id == R.id.ivarrow_back) {
                val fragmentlayanan = FragmentLayanan()
                val fragmentManager = parentFragmentManager
                fragmentManager.beginTransaction().apply {
                    replace(
                        R.id.container_fragment,
                        fragmentlayanan,
                        FragmentLayanan::class.java.simpleName
                    )
                    addToBackStack(null)
                    commit()
                }
            }

            if (v?.id == R.id.btn_kirim_pengaduan) {
                                val popupLaporan = PopupLaporan()
                                val fragmentManager = parentFragmentManager
                                fragmentManager.beginTransaction().apply {
                                    replace(
                                        R.id.container_fragment,
                                        popupLaporan,
                                        PopupLaporan::class.java.simpleName
                                    )
                                    addToBackStack(null)
                                    commit()
                                }
                            }

        }

    }
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
