package com.duyphung.engvocalearn.data.entity.reletionship

import androidx.room.Embedded
import androidx.room.Relation
import com.duyphung.engvocalearn.data.entity.Meaning
import com.duyphung.engvocalearn.data.entity.Word

data class WordWithMeanings(
    @Embedded val word: Word,
    @Relation(
        parentColumn = "id",
        entityColumn = "wordId"
    )
    val meanings: List<Meaning>
)