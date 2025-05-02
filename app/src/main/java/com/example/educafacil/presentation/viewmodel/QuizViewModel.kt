package com.example.educafacil.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educafacil.data.auth.FirebaseAuthManager
import com.example.educafacil.data.model.Quiz
import com.example.educafacil.data.model.UserScore
import com.example.educafacil.domain.usecase.GetQuizUseCase
import com.example.educafacil.domain.usecase.SaveUserScoreUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(
    private val getQuizUseCase: GetQuizUseCase,
    private val saveUserScoreUseCase: SaveUserScoreUseCase,
    private val firebaseAuthManager: FirebaseAuthManager
) : ViewModel() {

    private val _currentQuiz = MutableStateFlow<Quiz?>(null)
    val currentQuiz: StateFlow<Quiz?> = _currentQuiz
    var isLoading by mutableStateOf(false)
    var selectedAnswers = mutableListOf<Int>()
    var score by mutableStateOf(0)
    var currentQuestionIndex by mutableStateOf(0)
    var isQuizFinished by mutableStateOf(false)

    fun loadQuiz(id: String) {
        viewModelScope.launch {
            isLoading = true
            _currentQuiz.value = getQuizUseCase(id)
            isLoading = false
        }
    }
    fun selectAnswer(answerIndex: Int) {
        selectedAnswers.add(answerIndex)
        if (_currentQuiz.value == null) return

        val question = _currentQuiz.value!!.questions[currentQuestionIndex]
        if (answerIndex == question.correctAnswerIndex) {
            score++
        }

        if (currentQuestionIndex < _currentQuiz.value!!.questions.size - 1) {
            currentQuestionIndex++
        } else {
            finishQuiz()
        }
    }

    private fun finishQuiz() {
        isQuizFinished = true
        val user = firebaseAuthManager.getCurrentUser()
        if (user != null) {
            val userScore = UserScore(
                userId = user.uid,
                username = user.email ?: "",
                score = score
            )
            viewModelScope.launch {
                saveUserScoreUseCase(userScore)
            }
        }
    }
}
