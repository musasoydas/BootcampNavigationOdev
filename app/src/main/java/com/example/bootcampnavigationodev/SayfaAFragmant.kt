package com.example.bootcampnavigationodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampnavigationodev.R
import com.example.bootcampnavigationodev.databinding.FragmentSayfaAFragmantBinding

class SayfaAFragmant : Fragment() {

    private lateinit var binding: FragmentSayfaAFragmantBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSayfaAFragmantBinding.inflate(inflater, container, false)

        binding.GoB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.gecisB)
        }

        return binding.root
    }

}