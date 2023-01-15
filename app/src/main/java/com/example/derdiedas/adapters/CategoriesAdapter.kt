package com.example.derdiedas.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.derdiedas.R

class CategoriesAdapter(private val iconList: ArrayList<Int>, private val categoriesList: ArrayList<String>, private val buttonClickListener:ButtonClickListener) :
    RecyclerView.Adapter<CategoriesAdapter.ViewHolder>() {

    interface ButtonClickListener{
        fun ButtonClicked(position:Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
     return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.category_custom_row, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return iconList.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val ivIcon= itemView.findViewById<ImageView>(R.id.iv_icon)
        private val tvText = itemView.findViewById<Button>(R.id.btn_category_name)
        fun bind(position: Int) {
            val icon = iconList[position]
            val category = categoriesList[position]

            ivIcon.setImageResource(icon)
            tvText.text = category

            tvText.setOnClickListener{
                buttonClickListener.ButtonClicked(position)
            }
        }
    }
}
