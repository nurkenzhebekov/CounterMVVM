package com.example.countermvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class CounterViewModel(private val repository: Repository) : ViewModel() {

    val count: LiveData<Int> = repository.count


    fun incrementCount() {
        repository.incrementCount()
    }

    fun decrementCount() {
        repository.decrementCount()
    }

    fun resetCount() {
        repository.resetCount()
    }

}