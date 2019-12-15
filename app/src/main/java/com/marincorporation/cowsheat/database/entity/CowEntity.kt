package com.marincorporation.cowsheat.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey

@Entity(tableName = "cow",
    foreignKeys = [ForeignKey(
        entity = HeatEntity::class,
        parentColumns = ["cow_id"],
        childColumns = ["id_heat"],
        onDelete = CASCADE)])
data class CowEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "cow_id")
    var cowId: Long = 0L,

    @ColumnInfo(name = "cow_name")
    val cowName: String,

    @ColumnInfo(name = "cow_breed")
    var cowBreed: String,

    @ColumnInfo(name = "heat_id")
    var idHeat: Long = 0L
)