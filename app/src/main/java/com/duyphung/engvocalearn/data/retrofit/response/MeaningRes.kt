package com.duyphung.engvocalearn.data.retrofit.response


import com.google.gson.annotations.SerializedName

data class MeaningRes(
    @SerializedName("antonyms")
    val antonyms: List<String>,
    @SerializedName("definitions")
    val definitionRes: List<DefinitionRes>,
    @SerializedName("partOfSpeech")
    val partOfSpeech: String,
    @SerializedName("synonyms")
    val synonyms: List<String>
)