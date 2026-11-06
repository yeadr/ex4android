package com.example.yussefact4

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.yussefact4.databinding.FragmentdosBinding

class FragmentDos : Fragment() {

    private lateinit var binding: FragmentdosBinding

     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {

        binding = FragmentdosBinding.inflate(inflater, container, false)
        return binding.root
    }
}