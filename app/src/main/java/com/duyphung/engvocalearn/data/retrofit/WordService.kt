package com.duyphung.engvocalearn.data.retrofit

import com.duyphung.engvocalearn.data.retrofit.response.WordRes
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


interface WordService {
    @GET("{word}")
    suspend fun getWord(@Path("word") word: String): Response<WordRes>

//    @GET("filter.php?")
//    fun getMealsByCategory(@Query("i") category:String):Call<MealsResponse>
//
//    @GET ("random.php")
//    fun getRandomMeal():Call<RandomMealResponse>
//
//    @GET("lookup.php?")
//    fun getMealById(@Query("i") id:String):Call<RandomMealResponse>
//
//    @GET("search.php?")
//    fun getMealByName(@Query("s") s:String):Call<RandomMealResponse>
}