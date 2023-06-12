package com.rujirakongsomran.jc_codelabuserecyclerviewscrollablelist.adapter

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rujirakongsomran.jc_codelabuserecyclerviewscrollablelist.R
import com.rujirakongsomran.jc_codelabuserecyclerviewscrollablelist.model.Affirmation

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textview: TextView = view.findViewById(R.id.item_title)
    }
}