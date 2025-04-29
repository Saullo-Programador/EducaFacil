package com.example.educafacil.domain.usecase

import com.example.educafacil.data.model.Quiz
import com.example.educafacil.domain.repository.QuizRepository

class GetQuizUseCase(
    private val repository: QuizRepository
) {
    suspend operator fun invoke(id: String): Quiz? = repository.getQuizById(id)
    suspend fun getAll(): List<Quiz> = repository.getAllQuizzes()
}
