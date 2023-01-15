package com.example.derdiedas.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.derdiedas.R


class WelcomeFragment : Fragment() {
    private lateinit var btnTrain: Button
    private lateinit var btnWords: Button
        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_welcome, container, false)
        btnTrain = view.findViewById(R.id.btn_train)
        btnTrain.setOnClickListener {  Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_categoriesFragment) }

        btnWords=view.findViewById(R.id.btn_words)
        btnWords.setOnClickListener{
           Navigation.findNavController(view).navigate(R.id.action_welcomeFragment_to_wordsFragment)
        }

        return view
    }


    //    წესით action bar უნდა დამალოს
    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity?)!!.supportActionBar!!.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity?)!!.supportActionBar!!.show()
    }
}