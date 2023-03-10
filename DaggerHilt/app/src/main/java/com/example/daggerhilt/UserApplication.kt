package com.example.daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
/////////  ths annotation use for only Application class
@HiltAndroidApp
/////////////------------------------
class UserApplication :Application(){
///*
////////////    field injection
    @Inject
    lateinit var userRepo:UserRepo
////////////////////////----------------------------
    override fun onCreate() {
        super.onCreate()
        userRepo.saveData("sub@gmail.com","hvfkjahv")
    }

// */
}