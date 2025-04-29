package com.example.educafacil.domain.repository

import com.example.educafacil.data.model.Quiz
import com.example.educafacil.data.model.UserScore

interface QuizRepository {
    suspend fun getQuizById(id: String): Quiz?
    suspend fun getAllQuizzes(): List<Quiz>
    suspend fun saveUserScore(userScore: UserScore)
    suspend fun getRanking(): List<UserScore>
    suspend fun getUserScores(id: String): List<UserScore>
}
