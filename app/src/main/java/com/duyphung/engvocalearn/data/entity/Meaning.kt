package com.duyphung.engvocalearn.data.entity

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity
data class Meaning(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    var partOfSpeech: String,
    val wordId: Long,
)
