package com.duyphung.engvocalearn.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.duyphung.engvocalearn.data.entity.Definition
import com.duyphung.engvocalearn.data.entity.Meaning
import com.duyphung.engvocalearn.data.entity.Review
import com.duyphung.engvocalearn.data.entity.Word
import com.duyphung.engvocalearn.di.ApplicationScope
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject
import javax.inject.Provider

@Database(entities = [Word::class, Review::class, Meaning::class, Definition::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun getWordDao(): WordDao

    class Callback @Inject constructor(
        private val database: Provider<AppDatabase>,
        @ApplicationScope private val applicationScope: CoroutineScope
    ) : RoomDatabase.Callback()

}

