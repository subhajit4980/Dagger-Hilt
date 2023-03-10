package com.example.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/////////  ths annotation use for all classes
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//    field injection
//    @Inject
//    lateinit var userRepo:UserRepo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        userRepo.saveData("suhchj@gmail.com","dfbsfgn")
    }
}