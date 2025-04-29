package com.example.educafacil.domain.usecase

import com.example.educafacil.data.model.UserScore
import com.example.educafacil.domain.repository.QuizRepository
import javax.inject.Inject

class GetRankingUseCase @Inject constructor(
    private val repository: QuizRepository
) {
    suspend operator fun invoke(): List<UserScore> = repository.getRanking()
}