package com.marincorporation.cowsheat.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "notify")
data class NotifyEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "notify_id")
    var NotifyId: Long = 0L,

    @ColumnInfo(name = "notify_date")
    val notifyDate: Date,

    @ColumnInfo(name = "notify_time")
    var notifyTime: String

)