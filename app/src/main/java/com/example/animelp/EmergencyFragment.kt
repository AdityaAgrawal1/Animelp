package com.example.animelp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView


/**
 * A simple [Fragment] subclass.
 * Use the [EmergencyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EmergencyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return ComposeView(requireContext()).apply {
            setContent {
                Text(text = "Hello world.")
            }
        }
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            EmergencyFragment()
    }
}
