package com.example.androidnavigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentLogin : Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        submitBtnID.setOnClickListener {

            val userName = userNameID.text.toString()
            val password = passwordID.text.toString()

            val action = FragmentLoginDirections.actionFragmentLoginToFragmentWelcome(userName,password)
            findNavController().navigate(action)
        }
    }

}