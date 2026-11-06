package com.example.yussefact4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.yussefact4.databinding.FinalfragmentBinding

class FinalFragment : Fragment() {

    private lateinit var binding: FinalfragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FinalfragmentBinding.inflate(inflater, container, false)

        binding.btnHome.setOnClickListener {
            findNavController().navigate(R.id.action_final_to_home)
        }

        return binding.root
    }
}