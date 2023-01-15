package com.example.derdiedas.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.derdiedas.ApiService
import com.example.derdiedas.R
import com.example.derdiedas.ServiceGenerator
import com.example.derdiedas.WordModel
import com.example.derdiedas.adapters.WordAdapter
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback


class WordsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_words, container, false)

        val recyclerView : RecyclerView = view.findViewById(R.id.myRecyclerView)

        val serviceGenerator = ServiceGenerator.buildService(ApiService::class.java)
        val call = serviceGenerator.getWords()

        call.enqueue(object: Callback,
            retrofit2.Callback<MutableList<WordModel>> {
            override fun onResponse(
                call: Call<MutableList<WordModel>>,
                response: Response<MutableList<WordModel>>
            ) {
                recyclerView.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = WordAdapter(response.body()!!)
                }
            }

            override fun onFailure(call: Call<MutableList<WordModel>>, t: Throwable) {
                t.printStackTrace()
                Log.e("error", t.message.toString())
            }

        })

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