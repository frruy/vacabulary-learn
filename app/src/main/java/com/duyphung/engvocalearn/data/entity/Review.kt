package com.duyphung.engvocalearn.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Review(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0, // Primary key with auto-generated value
    var createdAt: Long, // Timestamp when the review was created (in milliseconds)
    val wordId: Long
)
