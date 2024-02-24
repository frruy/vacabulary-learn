package com.duyphung.engvocalearn.data.entity.reletionship

import androidx.room.Embedded
import androidx.room.Relation
import com.duyphung.engvocalearn.data.entity.Review
import com.duyphung.engvocalearn.data.entity.Word

data class WordWithReviews(
    @Embedded val word: Word,
    @Relation(
        parentColumn = "id",
        entityColumn = "wordId"
    )
    val reviews: List<Review>
)