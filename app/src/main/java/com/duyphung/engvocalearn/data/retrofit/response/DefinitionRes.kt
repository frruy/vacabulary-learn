package com.duyphung.engvocalearn.data.retrofit.response


import com.google.gson.annotations.SerializedName

data class DefinitionRes(
    @SerializedName("antonyms")
    val antonyms: List<Any>,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("example")
    val example: String,
    @SerializedName("synonyms")
    val synonyms: List<Any>
)