package com.duyphung.engvocalearn.data.retrofit.response


import com.google.gson.annotations.SerializedName

data class WordItemRes(
    @SerializedName("license")
    val licenseRes: LicenseRes,
    @SerializedName("meanings")
    val meaningRes: List<MeaningRes>,
    @SerializedName("phonetics")
    val phoneticRes: List<PhoneticRes>,
    @SerializedName("sourceUrls")
    val sourceUrls: List<String>,
    @SerializedName("word")
    val word: String
)