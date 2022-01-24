package com.example.mobiuz.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mobiuz.R
import com.example.mobiuz.models.TarifData
import kotlinx.android.synthetic.main.drop_item.view.*

class RvTarifAdapter(var list: ArrayList<TarifData>, var context: Context) :
    RecyclerView.Adapter<RvTarifAdapter.Vh>() {
    inner class Vh(var itemview: View) : RecyclerView.ViewHolder(itemview) {
        fun Bind(data: TarifData) {
            itemview.tarif_name.text = data.tarif_name
            itemview.tarif_cost.text = data.tarif_cost
            itemview.tarif_minute.text = data.tarif_minute
            itemview.tarif_mb.text = data.tarif_mb
            itemview.tarif_sms.text = data.tarif_sms
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(LayoutInflater.from(parent.context).inflate(R.layout.drop_item, parent, false))
    }

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.Bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}