package com.example.educafacil.data.model

import com.google.firebase.firestore.PropertyName

data class Question(
    @get:PropertyName("text") @set:PropertyName("text")
    var question: String = "",

    @get:PropertyName("answers") @set:PropertyName("answers")
    var options: List<String> = emptyList(),

    var correctAnswerIndex: Int = 0
)


