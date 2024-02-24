package com.duyphung.engvocalearn.data.retrofit.response


import com.google.gson.annotations.SerializedName

data class PhoneticRes(
    @SerializedName("audio")
    val audio: String,
    @SerializedName("license")
    val licenseRes: LicenseRes,
    @SerializedName("sourceUrl")
    val sourceUrl: String,
    @SerializedName("text")
    val text: String
)