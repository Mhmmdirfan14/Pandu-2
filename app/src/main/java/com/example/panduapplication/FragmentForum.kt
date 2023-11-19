package com.example.panduapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 49a6c03 (final-project)


class FragmentForum : Fragment(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
<<<<<<< HEAD
=======
=======
import android.widget.ImageView


class FragmentForum : Fragment(), View.OnClickListener {
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_forum, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnKades:Button = view.findViewById(R.id.btn_kades)
        btnKades.setOnClickListener(this)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

        val ivComment:ImageView = view.findViewById(R.id.iv_comment)
        ivComment.setOnClickListener(this)

>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_kades){
            val fragmentKades = FragmentKades()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentKades, FragmentKades::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

        if(v?.id == R.id.iv_comment){
            val fragmentKomentarAduan= FragmentKomentarAduan()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentKomentarAduan, FragmentKomentarAduan::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
    }

}