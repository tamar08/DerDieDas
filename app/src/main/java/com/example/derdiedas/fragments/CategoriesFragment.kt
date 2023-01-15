package com.example.derdiedas.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.derdiedas.R
import com.example.derdiedas.adapters.CategoriesAdapter


class CategoriesFragment : Fragment() {
    private lateinit var  recView : RecyclerView

   override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_categories, container, false)

        recView = view.findViewById(R.id.RecyclerView)
        recView.layoutManager = LinearLayoutManager(context)
        recView.setHasFixedSize(true)
        recView.adapter = CategoriesAdapter(getIconList(),getCategoriesList(), object: CategoriesAdapter.ButtonClickListener
        {
            override fun ButtonClicked(position:Int){
                val action = CategoriesFragmentDirections.actionCategoriesFragmentToGameFragment(position)
                Navigation.findNavController(view).navigate(action)
            }
        })

        return view
    }

    private fun getCategoriesList():ArrayList<String>{
        val list = ArrayList<String>()
        list.add("Food")
        list.add("Drinks")
        list.add("Animals")
        list.add("Weather")
        list.add("Clothing")
        list.add("Household")
        list.add("body Parts")
        return list
    }
    private fun getIconList():ArrayList<Int>{
        val list = ArrayList<Int>()
        list.add(R.drawable.ic_food)
        list.add(R.drawable.ic_drinks)
        list.add(R.drawable.ic_bunny)
        list.add(R.drawable.ic_sunny)
        list.add(R.drawable.ic_clothes)
        list.add(R.drawable.ic_home)
        list.add(R.drawable.ic_hand)
        return list
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