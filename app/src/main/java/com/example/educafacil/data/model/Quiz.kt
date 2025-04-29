package com.example.educafacil.data.model

data class Quiz(
    val id: String = "",
    val title: String = "",
    val questions: List<Question> = emptyList()
)