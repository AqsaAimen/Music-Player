package com.example.musicplayer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.musicplayer.databinding.ActivityMainBinding


class MainFragment : Fragment() {

private lateinit var navController:NavController
private lateinit var  binding: ActivityMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_main, container, false)
        //val navHostFragment = supp.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        //navController = navHostFragment.navController
        return view
    }

}