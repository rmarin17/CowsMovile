package com.marincorporation.cowsheat.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "heat",
    foreignKeys = [ForeignKey(
        entity = NotifyEntity::class,
        parentColumns = ["heat_id"],
        childColumns = ["notify_id"],
        onDelete = ForeignKey.CASCADE
    )])
data class HeatEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "heat_id")
    var heatId: Long = 0L,

    @ColumnInfo(name = "heat_date")
    val heatDate: Date,

    @ColumnInfo(name = "heat_insemination")
    var heatTypeInsemination: String,

    @ColumnInfo(name = "heat_next_heat")
    val heatNextDate: Date,

    @ColumnInfo(name = "heat_bull")
    var heatNameBull: String,

    @ColumnInfo(name = "notify_id")
    var idNotify: Long = 0L
)