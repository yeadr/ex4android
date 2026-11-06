package com.example.yussefact4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.yussefact4.databinding.MainfragmentBinding

class MainFragment : Fragment() {

    private lateinit var binding: MainfragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = MainfragmentBinding.inflate(inflater, container, false)

        binding.btnUno.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_uno)
        }

        binding.btnDos.setOnClickListener {
            findNavController().navigate(R.id.action_home_to_dos)
        }

        return binding.root
    }
}