package com.duyphung.engvocalearn.data.entity.reletionship

import androidx.room.Embedded
import androidx.room.Relation
import com.duyphung.engvocalearn.data.entity.Definition
import com.duyphung.engvocalearn.data.entity.Meaning

class MeaningWithDefinitions(
    @Embedded
    val meaning: Meaning,
    @Relation(
        parentColumn = "id",
        entityColumn = "meaningId"
    )
    val definitions: List<Definition>
)