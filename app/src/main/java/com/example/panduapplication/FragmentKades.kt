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
=======
import android.widget.ImageView
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)


class FragmentKades : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kades, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnAduan: Button = view.findViewById(R.id.btn_aduan)
        btnAduan.setOnClickListener(this)
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

        val IvCommentKades: ImageView = view.findViewById(R.id.iv_comment_kades)
        IvCommentKades.setOnClickListener(this)
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
    }

    override fun onClick(v: View?) {
        if(v?.id == R.id.btn_aduan){
            val fragmentforum = FragmentForum()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, fragmentforum, FragmentForum::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

        if(v?.id == R.id.iv_comment_kades){
            val komentarkadesFragment= KomentarkadesFragment()
            val fragmentManager = parentFragmentManager
            fragmentManager.beginTransaction().apply {
                replace(R.id.container_fragment, komentarkadesFragment, KomentarkadesFragment::class.java.simpleName)
                addToBackStack(null)
                commit()
            }
        }
>>>>>>> 9ab19c1 (final-project)
>>>>>>> 49a6c03 (final-project)
    }
}