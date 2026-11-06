package com.example.yussefact4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.yussefact4.databinding.FragmentunoBinding

class FragmentUno : Fragment() {

    private lateinit var binding: FragmentunoBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentunoBinding.inflate(inflater, container, false)

        binding.btnFinal.setOnClickListener {
            findNavController().navigate(R.id.action_uno_to_final)
        }

        return binding.root
    }
}