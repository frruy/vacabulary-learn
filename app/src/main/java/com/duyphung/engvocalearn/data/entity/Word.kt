package com.duyphung.engvocalearn.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Word(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val audio: String?,
    val text: String?,
    var isSaved: Boolean = true,
    var createdAt: Long = System.currentTimeMillis(),
)
