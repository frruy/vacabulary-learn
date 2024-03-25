package com.duyphung.engvocalearn.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.duyphung.engvocalearn.data.entity.Definition
import com.duyphung.engvocalearn.data.entity.Meaning
import com.duyphung.engvocalearn.data.entity.Review
import com.duyphung.engvocalearn.data.entity.Word
import com.duyphung.engvocalearn.data.retrofit.response.WordItemRes
import com.duyphung.engvocalearn.data.retrofit.response.WordRes
import com.duyphung.engvocalearn.word.WordRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val homeRepository: WordRepository
) : ViewModel() {
    val wordLiveData: LiveData<WordRes> = liveData {
        val result = homeRepository.searchWord("cat")

        //todo handle data empty
        result.data?.let {
            emit(it)
            val word = Word(
                audio = it.first().phoneticRes.first().audio,
                text = it.first().word
            )

            val wordId = homeRepository.saveWord(word)

            val review = Review(wordId = wordId)
            homeRepository.saveReview(review)

            val meaning = Meaning(wordId = wordId, partOfSpeech = it.first().meaningRes.first().partOfSpeech)

            val meaningId = homeRepository.saveMeaning(meaning)

            Log.d("TAG", ": " + meaningId)

            val definition = Definition(
                definition = it.first().meaningRes.first().definitionRes.first().definition,
                example = it.first().meaningRes.first().definitionRes.first().example,
                meaningId = meaningId
            )

            homeRepository.saveDefinition(definition)
        }
    }



    fun saveWord(wordRes: WordItemRes) {
        val audio = wordRes.phoneticRes.last().audio //todo chose other if last().audio is empty
        val text = wordRes.word
        val isSaved = true //todo get user input
        val word = Word(audio = audio, text = text, isSaved = isSaved)


    }
}
