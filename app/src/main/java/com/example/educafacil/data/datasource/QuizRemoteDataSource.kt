package com.example.educafacil.data.datasource

import com.example.educafacil.data.model.Quiz
import com.example.educafacil.data.model.UserScore
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class QuizRemoteDataSource @Inject constructor() {
    private val firestore = FirebaseFirestore.getInstance()

    suspend fun fetchQuiz(id: String): Quiz? = suspendCoroutine { cont ->
        firestore.collection("quizzes").document(id)
            .get()
            .addOnSuccessListener { document ->
                val quiz = document.toObject(Quiz::class.java)
                cont.resume(quiz)
            }
            .addOnFailureListener { e ->
                cont.resume(null)
            }
    }
    suspend fun getAllQuizzes(): List<Quiz> = suspendCoroutine { cont ->
        firestore.collection("quizzes")
            .get()
            .addOnSuccessListener { querySnapshot ->
                val quizzes = querySnapshot.documents.mapNotNull { document ->
                    val quiz = document.toObject(Quiz::class.java)
                    quiz?.copy(id = document.id)
                }
                cont.resume(quizzes)
            }
            .addOnFailureListener { e ->
                cont.resume(emptyList())
            }
    }

    suspend fun saveUserScore(userScore: UserScore) {
        firestore.collection("ranking")
            .add(userScore)
    }

    suspend fun getRanking(): List<UserScore> {
        return firestore.collection("ranking")
            .orderBy("score", com.google.firebase.firestore.Query.Direction.DESCENDING)
            .get()
            .await()
            .toObjects(UserScore::class.java)
    }

    suspend fun getUserScores(userId: String): List<UserScore> {
        return firestore.collection("ranking")
            .whereEqualTo("userId", userId)
            .get()
            .await()
            .toObjects(UserScore::class.java)
    }



}
