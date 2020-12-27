package com.example.androidnavigationcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

class FragmentHome : Fragment(R.layout.fragment_home) {
    init {
        Toast.makeText(context,"Fragment Home Open", Toast.LENGTH_SHORT)
            .show()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}