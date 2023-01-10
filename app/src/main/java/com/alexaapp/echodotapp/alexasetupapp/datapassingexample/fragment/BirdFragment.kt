package com.alexaapp.echodotapp.alexasetupapp.datapassingexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alexaapp.echodotapp.alexasetupapp.datapassingexample.databinding.FragBirdBinding

class BirdFragment : Fragment() {
    private var _binding: FragBirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragBirdBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}