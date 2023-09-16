package com.example.bootcampnavigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampnavigationodev.databinding.FragmentAnasayfaBinding


class FragmentAnasayfa : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.GoA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisA)
        }

        binding.GoX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisX)
        }
        return binding.root


    }

}