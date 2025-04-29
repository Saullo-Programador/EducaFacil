package com.example.educafacil.data.repository

import com.example.educafacil.data.datasource.QuizRemoteDataSource
import com.example.educafacil.data.model.Quiz
import com.example.educafacil.data.model.UserScore
import com.example.educafacil.domain.repository.QuizRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class QuizRepositoryImpl @Inject constructor(
    private val remoteDataSource: QuizRemoteDataSource,
) : QuizRepository {
    override suspend fun getQuizById(id: String): Quiz? = remoteDataSource.fetchQuiz(id)
    override suspend fun getAllQuizzes(): List<Quiz> = remoteDataSource.getAllQuizzes()
    override suspend fun saveUserScore(userScore: UserScore) {
        remoteDataSource.saveUserScore(userScore)
    }
    override suspend fun getRanking(): List<UserScore> = remoteDataSource.getRanking()
    override suspend fun getUserScores(id: String): List<UserScore> = remoteDataSource.getUserScores(id)
}