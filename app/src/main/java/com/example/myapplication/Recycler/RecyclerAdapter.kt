package com.example.myapplication.Recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.place_cardview.view.*

class RecyclerAdapter(private val placeList: List<RecyclerModel>) :
    RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder>() {
    inner class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cityTo: TextView = itemView.toPlaceText
        val cityFrom: TextView = itemView.fromPlaceText
        val duration: TextView = itemView.durationText

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.place_cardview, parent, false);
        return RecyclerViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {

        val currentItem = placeList[position];
        Picasso.get().load(currentItem.imageRe).into(holder.itemView.imageView);
        holder.cityTo.text = currentItem.cityTO;
        holder.cityFrom.text = currentItem.cityFrom;
        holder.duration.text = currentItem.duration

    }

    override fun getItemCount() = placeList.size

}


