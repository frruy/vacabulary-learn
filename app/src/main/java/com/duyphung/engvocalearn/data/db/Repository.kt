package com.example.easyfood.data.db

class Repository(private val wordDao: com.duyphung.engvocalearn.data.db.WordDao) {

//    val mealList: LiveData<List<MealDB>> = getWordDao.getAllSavedMeals()
//
//    suspend fun insertFavoriteMeal(meal: MealDB) {
//        getWordDao.insertFavorite(meal)
//    }
//
//    suspend fun getMealById(mealId: String): MealDB {
//        return getWordDao.getMealById(mealId)
//    }
//
//    suspend fun deleteMealById(mealId: String) {
//        getWordDao.deleteMealById(mealId)
//    }
//
//    suspend fun deleteMeal(meal: MealDB) = getWordDao.deleteMeal(meal)

    suspend fun insertWord(word: com.duyphung.engvocalearn.data.entity.Word) {
        wordDao.insertWord(word)
    }
}