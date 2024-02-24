package com.duyphung.engvocalearn.word

import com.duyphung.engvocalearn.data.db.WordDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WordRepository @Inject constructor(
    private val wordRemoteDataSource: WordRemoteDataSource,
    private val dao: WordDao
) {

    suspend fun searchWord(word: String) =
        wordRemoteDataSource.getWord()
}