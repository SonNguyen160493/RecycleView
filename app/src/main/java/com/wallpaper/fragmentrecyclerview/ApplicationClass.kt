package com.wallpaper.fragmentrecyclerview

import android.app.Application

class ApplicationClass: Application() {

    companion object {
        var people: ArrayList<Person> = ArrayList()
    }

    override fun onCreate() {
        super.onCreate()

        people.add(Person("Chuck Norris", "0123456789"))
        people.add(Person("John Rambo", "9876543210"))
        people.add(Person("Nelson Mandela", "0123654789"))
    }
}