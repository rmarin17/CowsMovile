package com.marincorporation.cowsheat.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.marincorporation.cowsheat.database.pojo.ShowHeat

@Dao
interface HeatDao{

    @Query("SELECT * from daily_sleep_quality_table WHERE nightId = :key")
    fun getHeat(key: Long): LiveData<List<ShowHeat>>?
}
