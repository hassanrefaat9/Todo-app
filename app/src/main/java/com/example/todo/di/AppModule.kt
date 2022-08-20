package com.example.todo.di

import android.app.Application
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.todo.data.TodoDatabase
import com.example.todo.data.TodoRepository
import com.example.todo.data.TodoRepositoryIml
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTodoDatabase(app: Application): TodoDatabase {
        return Room.databaseBuilder(
            app,
            TodoDatabase::class.java,
            "todo_database"
        ).build()
    }

    @Provides
    @Singleton
    fun provideTodoRepository(db:TodoDatabase): TodoRepository {
        return TodoRepositoryIml(db.dao)
    }
}