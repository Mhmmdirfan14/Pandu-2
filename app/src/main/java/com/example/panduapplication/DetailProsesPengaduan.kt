package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class DetailProsesPengaduan : Fragment(), View.OnClickListener {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.detail_proses_pengaduan, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ivArrowBack: ImageView = view.findViewById(R.id.iv_back_proses)
        ivArrowBack.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.iv_back_proses) {
            val prosesPengaduan = ProsesPengaduan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(
                    R.id.container_fragment,
                    prosesPengaduan ,
                    ProsesPengaduan::class.java.simpleName
                )
                addToBackStack(null)
                commit()
            }
        }
    }

}