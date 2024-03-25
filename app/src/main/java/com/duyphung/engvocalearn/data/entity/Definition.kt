package com.duyphung.engvocalearn.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
data class Definition(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    var definition: String,
    var example: String?,
    val meaningId: Long
)
