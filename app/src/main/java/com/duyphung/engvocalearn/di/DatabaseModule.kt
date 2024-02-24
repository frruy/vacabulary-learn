package com.duyphung.engvocalearn.di

import android.app.Application
import androidx.room.Room
import com.duyphung.engvocalearn.data.db.WordDao
import com.duyphung.engvocalearn.data.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        application: Application,
        callback: AppDatabase.Callback
    ): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "word_database")
            .fallbackToDestructiveMigration()
            .addCallback(callback)
            .build()
    }

    @Provides
    fun provideWordDao(db: AppDatabase): WordDao {
        return db.getWordDao()
    }
}