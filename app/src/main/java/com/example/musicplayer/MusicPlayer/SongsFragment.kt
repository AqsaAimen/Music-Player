package com.example.musicplayer.MusicPlayer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import com.example.musicplayer.R




class SongsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_songs, container, false)
        val imagview:ImageView= view.findViewById(R.id.imageview6)
        imagview.setOnClickListener {
            imagview.findNavController().navigate(R.id.action_songsFragment_to_songsListFragment)
        }

        return view
    }


}