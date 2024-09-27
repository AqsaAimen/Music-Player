package com.example.musicplayer.Login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import com.example.musicplayer.R


class LoginFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_login, container, false)
        val button:Button= view.findViewById(R.id.b1)
        button.setOnClickListener {
            button.findNavController().navigate(R.id.action_loginFragment_to_songsFragment)
        }
        return view
    }


}