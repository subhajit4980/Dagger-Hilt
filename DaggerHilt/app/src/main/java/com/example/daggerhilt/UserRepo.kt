package com.example.daggerhilt

import android.util.Log
import android.widget.Toast
import javax.inject.Inject

// 1 .
/*
//--------------------------------constructor injection
class UserRepo @Inject constructor(private val loggerService: LoggerService) {
    fun saveData(email:String,password:String)
    {
//        Log.d("TAG","save user data")
        loggerService.log("save user data in DB")
    }

 */





//// 2. for interface we need to create a module to state that which class we needed
interface UserRepo{
    fun saveData(email:String,password:String)

}
class SQLRepo @Inject constructor():UserRepo{
    override fun saveData(email:String, password:String)
    {
        Log.d("TAG","save user data SQL")
    }
}
// we need to return this in module class
class FirebaseRepo @Inject constructor():UserRepo{
    override fun saveData(email:String, password:String)
    {
        Log.d("TAG","save user data firebase")
    }
}