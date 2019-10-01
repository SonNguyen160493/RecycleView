package com.wallpaper.fragmentrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wallpaper.fragmentrecyclerview.ApplicationClass.Companion.people
import kotlinx.android.synthetic.main.row_layout.view.*

class PersonAdapter(context: Context?, private val list: ArrayList<Person>) :
    RecyclerView.Adapter<PersonAdapter.MyViewHolder>() {

    var activityClick: ItemClicked? = context as ItemClicked

    interface ItemClicked {
        fun onItemClicked(index: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return people.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.itemView.tag = list[position]
        holder.tvName.text = list[position].name

        holder.itemView.setOnClickListener {
            activityClick?.onItemClicked(list.indexOf(holder.itemView.tag as Person))
        }
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.tvNameList
    }
}