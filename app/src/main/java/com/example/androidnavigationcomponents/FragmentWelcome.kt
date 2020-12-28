package com.example.androidnavigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_search.*
import kotlinx.android.synthetic.main.fragment_welcome.*

class FragmentWelcome : Fragment(R.layout.fragment_welcome) {

    private val args : FragmentWelcomeArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        userNameID_welcome.text = args.userName
        userPasswordID_welcome.text = args.password

       okBtnID.setOnClickListener {
           val action = FragmentWelcomeDirections.actionFragmentWelcomeToFragmentHome()
           findNavController().navigate(action)
       }

    }

}