package com.example.androidcleanarchitecture.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import com.example.androidcleanarchitecture.R

class BlankFragment : Fragment() {

    //Fragment ima referencu
    // na viewModel, nothing fancy over here
    private val viewModel = SomeViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    //Funkcija koja poziva neku metodu u viewmodelu,
    //ususall stuff
    private fun doSomething(){
        viewModel.doSomethingFancyInThisMethod()
    }
}