package com.example.daggerhilt

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
//  we need to mention this annotation in the activity also
@AndroidEntryPoint
class mainFragment : Fragment() {
//          field injection
    @Inject
    @FirebaseQualifier   // it will provide the firebase repo without any confusion
    lateinit var userRepo: UserRepo
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        userRepo.saveData("dfv","fvdv")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}