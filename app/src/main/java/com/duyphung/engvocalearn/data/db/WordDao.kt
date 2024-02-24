package com.duyphung.engvocalearn.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Update
import com.duyphung.engvocalearn.data.entity.Word

@Dao
interface WordDao {
    @Insert
    fun insertWord(word: Word)

    @Update
    fun updateWord(word: Word)

//    @Query("SELECT * FROM meal_information order by mealId asc")
//    fun getAllSavedMeals(): LiveData<List<MealDB>>
//
//    @Query("SELECT * FROM meal_information WHERE mealId =:id")
//    fun getMealById(id: String): MealDB
//
//    @Query("DELETE FROM meal_information WHERE mealId =:id")
//    fun deleteMealById(id: String)

    @Delete
    fun deleteWord(word: Word)
}