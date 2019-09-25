package com.wallpaper.fragmentrecyclerview

import android.app.Application

class ApplicationClass: Application() {

    companion object {
        var people: ArrayList<Person>?= null
    }

    override fun onCreate() {
        super.onCreate()
        people = ArrayList()

    }
}