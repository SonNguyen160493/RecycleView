package com.wallpaper.fragmentrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_add_person.*
import kotlinx.android.synthetic.main.fragment_detail.*

class MainActivity : AppCompatActivity(), PersonAdapter.ItemClicked {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            ApplicationClass.people.add(Person(etName.text.toString(), etPhoneNumber.text.toString()))
            Toast.makeText(this, "${etName.text} has added!", Toast.LENGTH_SHORT).show()
            etName.text = null
            etPhoneNumber.text = null
            (this.supportFragmentManager.findFragmentById(R.id.listFragView) as ListFrag).notifyDataChanged()
        }

        onItemClicked(0)
    }

    override fun onItemClicked(index: Int) {
        tvName.text = ApplicationClass.people[index].name
        tvPhoneNumber.text = ApplicationClass.people[index].telNumber
    }
}
