package com.example.educafacil.di

import com.example.educafacil.data.auth.FirebaseAuthManager
import com.example.educafacil.data.datasource.QuizRemoteDataSource
import com.example.educafacil.data.repository.QuizRepositoryImpl
import com.example.educafacil.domain.repository.QuizRepository
import com.example.educafacil.domain.usecase.GetQuizUseCase
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
    fun provideFirebaseAuthManager(): FirebaseAuthManager = FirebaseAuthManager()

    @Provides
    @Singleton
    fun provideQuizRemoteDataSource(): QuizRemoteDataSource = QuizRemoteDataSource()

    @Provides
    @Singleton
    fun provideQuizRepository(remote: QuizRemoteDataSource): QuizRepository =
        QuizRepositoryImpl(remote)

    @Provides
    @Singleton
    fun provideGetQuizUseCase(repository: QuizRepository): GetQuizUseCase =
        GetQuizUseCase(repository)

}