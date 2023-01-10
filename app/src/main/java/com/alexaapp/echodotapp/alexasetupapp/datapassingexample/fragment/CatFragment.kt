package com.alexaapp.echodotapp.alexasetupapp.datapassingexample.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alexaapp.echodotapp.alexasetupapp.datapassingexample.databinding.FragCatBinding

class CatFragment : Fragment() {

    private var _binding: FragCatBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragCatBinding.inflate(inflater, container, false)
        val view = binding.root

        val tvText= _binding!!.tvText
        val tvAge= _binding!!.tvAge
        val btnSend= _binding!!.btnSend
        btnSend.setOnClickListener(View.OnClickListener {
            val newFragment = DogFragment()
            val args = Bundle()
            args.putString("dog_data", tvAge.text.toString())
            newFragment.setArguments(args)
        })

        return view
    }
}