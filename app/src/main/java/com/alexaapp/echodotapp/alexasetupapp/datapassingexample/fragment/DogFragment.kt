package com.alexaapp.echodotapp.alexasetupapp.datapassingexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alexaapp.echodotapp.alexasetupapp.datapassingexample.databinding.FragDogBinding

class DogFragment : Fragment() {

    private var _binding: FragDogBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragDogBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}