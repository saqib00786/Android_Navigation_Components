package com.example.androidnavigationcomponents
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment

class FragmentSearch : Fragment(R.layout.fragment_search) {
    init {
        Toast.makeText(context,"Fragment Search Open",Toast.LENGTH_SHORT)
            .show()
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}