package com.example.countermvvm.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface CounterDao {

    @Query("SELECT value FROM count")
    fun getCount(): LiveData<Int>

    @Query("UPDATE count SET value = value + 1")
    fun incrementCount()

    @Query("UPDATE count SET value = value - 1")
    fun decrementCount()

    @Query("UPDATE count SET value = 0")
    fun resetCount()

}