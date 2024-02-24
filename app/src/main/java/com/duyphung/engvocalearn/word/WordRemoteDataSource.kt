package com.duyphung.engvocalearn.word

import com.duyphung.engvocalearn.data.BaseDataSource
import com.duyphung.engvocalearn.data.retrofit.WordService
import javax.inject.Inject

class WordRemoteDataSource @Inject constructor(private val service: WordService) : BaseDataSource() {
    suspend fun getWord() = getResult { service.getWord() }

}