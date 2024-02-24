package com.duyphung.engvocalearn.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
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
    private val mutableWord = MutableLiveData<Word>()
    val word: LiveData<WordRes> = liveData {
        val result = homeRepository.searchWord("")
        result.data?.let { emit(it) }
    }
    init {
//        getWord()
    }

    fun getWord() {
//        val service = RetrofitInstance.wordService
//        CoroutineScope(Dispatchers.IO).launch {
//            val response = service.getWord()
//            withContext(Dispatchers.Main) {
//                try {
//                    if (response.isSuccessful) {
//                        //Do something with response e.g show to the UI.
//                    } else {
//                        println("Error: ${response.code()}")
//                    }
//                } catch (e: HttpException) {
//                    println("Exception ${e.message}")
//                } catch (e: Throwable) {
//                    println("Ooops: Something else went wrong")
//                }
//            }
//        }

//        homeRepository.searchWord("")
    }

    fun saveWord(wordRes: WordItemRes) {
        val audio = wordRes.phoneticRes.last().audio //todo chose other if last().audio is empty
        val text = wordRes.word
        val isSaved = true //todo get user input
        val word = Word(audio = audio, text = text, isSaved = isSaved)



    }
}
