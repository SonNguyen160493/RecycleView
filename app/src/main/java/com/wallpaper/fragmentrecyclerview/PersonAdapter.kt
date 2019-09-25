package com.wallpaper.fragmentrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_layout.view.*

class PersonAdapter(val context: Context, val list: ArrayList<Person>): RecyclerView.Adapter<PersonAdapter.MyViewHolder>() {

    private var people: ArrayList<Person>?= null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false))
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        people?.let {
            holder.itemView.tag = it[position]
            holder.tvName.text = it[position].name
        }

        holder.itemView.setOnClickListener {

        }
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val tvName = view.tvName
    }
}