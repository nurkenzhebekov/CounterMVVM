package com.example.countermvvm

import androidx.lifecycle.LiveData
import com.example.countermvvm.model.CounterDao

class Repository(private val counterDao: CounterDao) {

    val count: LiveData<Int> = counterDao.getCount()

    fun incrementCount() {
        counterDao.incrementCount()
    }

    fun decrementCount() {
        counterDao.decrementCount()
    }

    fun resetCount() {
        counterDao.resetCount()
    }

}