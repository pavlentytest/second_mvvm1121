package com.example.myapplication

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import android.util.*

class MainViewModel : ViewModel() {
    init {
        Log.d("RRR","ViewModel")
    }
    val counter = MutableLiveData<Int>()
    fun setCounter() {
        this.counter.value =
            (this.counter.value ?: 0) + 1
    }
}