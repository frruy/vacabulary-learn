package com.duyphung.engvocalearn.data.retrofit.response


import com.google.gson.annotations.SerializedName

data class LicenseRes(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)