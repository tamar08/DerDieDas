package com.example.derdiedas.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.derdiedas.R


class FinishFragment : Fragment() {
    private val args: FinishFragmentArgs by navArgs()


    private lateinit var tvResult1: TextView
    private lateinit var tvResult2: TextView
    private lateinit var finish:Button


    override fun onCreateView(
    inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_finish, container, false)

        tvResult1 = view.findViewById(R.id.tv_result1)
        tvResult2 = view.findViewById(R.id.tv_result2)
        finish = view.findViewById(R.id.btn_finish)

        val result = args.result
        tvResult2.text="Your Score is \n$result out of 10"

        if(result == 10){
            tvResult1.text = "Perfect!"
        }
        else if(result == 9 ){
            tvResult1.text = "Really Good!"
        }
        else if(result == 8 || result == 7){
            tvResult1.text = "Good!"
        }
        else if(result == 6 || result == 5){
            tvResult1.text = "Not Bad!"
        }
        else if(result == 3 || result == 4) {
            tvResult1.text = "Bad!"
        }
        else {
            tvResult1.text = "Really Bad!"
        }

        finish.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_finishFragment_to_welcomeFragment)
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