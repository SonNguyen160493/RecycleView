package com.wallpaper.fragmentrecyclerview


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 *
 */
class ListFrag : Fragment() {

    private var myAdapter: PersonAdapter?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        recycleList.setHasFixedSize(true)
        recycleList.layoutManager = LinearLayoutManager(this.activity)

        myAdapter = PersonAdapter(this@ListFrag.context, ApplicationClass.people)
        recycleList.adapter = myAdapter
    }

    fun notifyDataChanged(){
        myAdapter?.notifyDataSetChanged()
    }
}
