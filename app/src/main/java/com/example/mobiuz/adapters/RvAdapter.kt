package com.example.mobiuz.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobiuz.R
import com.example.mobiuz.models.Data
import kotlinx.android.synthetic.main.internet_item.view.*

class RvAdapter(var list: ArrayList<Data>) : RecyclerView.Adapter<RvAdapter.Vh>() {
    inner class Vh(var itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun Bind(data: Data) {
            itemview.mb.text = data.mb
            itemview.internet_cost.text = data.cost
            itemview.internet_day.text = data.day
            itemview.internet_code.text = data.code
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(
            LayoutInflater.from(parent.context).inflate(R.layout.internet_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.Bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}