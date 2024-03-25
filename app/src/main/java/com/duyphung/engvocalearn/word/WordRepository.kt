package com.duyphung.engvocalearn.word

import com.duyphung.engvocalearn.data.db.WordDao
import com.duyphung.engvocalearn.data.entity.Definition
import com.duyphung.engvocalearn.data.entity.Meaning
import com.duyphung.engvocalearn.data.entity.Review
import com.duyphung.engvocalearn.data.entity.Word
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordRepository @Inject constructor(
    private val wordRemoteDataSource: WordRemoteDataSource,
    private val dao: WordDao
) {

    suspend fun searchWord(word: String) = wordRemoteDataSource.getWord(word)

    suspend fun saveWord(word: Word) = dao.insertWord(word)

    suspend fun saveMeaning(meaning: Meaning) = dao.insertMeaning(meaning)

    suspend fun saveReview(review: Review) = dao.insertReview(review)

    suspend fun saveDefinition(definition: Definition) = dao.insertDefinition(definition)
}