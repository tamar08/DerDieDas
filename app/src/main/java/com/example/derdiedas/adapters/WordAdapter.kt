package com.example.derdiedas.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.derdiedas.R
import com.example.derdiedas.WordModel

class WordAdapter (private val wordModel: MutableList<WordModel>): RecyclerView.Adapter<WordViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.word_custom_card, parent, false)
        return WordViewHolder(view)
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        return holder.bindView(wordModel[position])
    }

    override fun getItemCount(): Int {
        return wordModel.size
    }
}

class WordViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val tvGerman : TextView = itemView.findViewById(R.id.tv_germanWord)
    private val tvEnglish : TextView = itemView.findViewById(R.id.tv_englishWord)
    fun bindView(wordModel: WordModel){
        tvGerman.text = wordModel.german
        tvEnglish.text = wordModel.english
    }
}