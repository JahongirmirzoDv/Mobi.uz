package com.example.mobiuz.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobiuz.R
import com.example.mobiuz.models.AksiyaData
import com.example.mobiuz.models.Data
import kotlinx.android.synthetic.main.aksiya_item.view.*
import kotlinx.android.synthetic.main.internet_item.view.*

class RvAksiyaAdapter(var list: ArrayList<AksiyaData>) : RecyclerView.Adapter<RvAksiyaAdapter.Vh>() {
    inner class Vh(var itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun Bind(data: AksiyaData) {
            itemview.news.text = data.name
            itemview.content.text = data.content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(
            LayoutInflater.from(parent.context).inflate(R.layout.aksiya_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.Bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}