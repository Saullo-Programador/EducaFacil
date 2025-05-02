package com.example.educafacil.data.model

data class UserScore(
    val userId: String = "",
    val username: String = "",
    val quizId: String = "",
    val score: Int = 0,
    val timestamp: Long = System.currentTimeMillis()
)