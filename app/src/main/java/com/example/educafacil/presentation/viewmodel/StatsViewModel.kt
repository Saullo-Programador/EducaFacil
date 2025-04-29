package com.example.educafacil.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educafacil.domain.repository.QuizRepository
import com.google.firebase.auth.FirebaseAuth
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class StatsViewModel @Inject constructor(
    private val repository: QuizRepository
) : ViewModel() {

    private val _stats = MutableStateFlow(UserStats())
    val stats: StateFlow<UserStats> = _stats

    init {
        loadUserStats()
    }

    private fun loadUserStats() {
        val userId = FirebaseAuth.getInstance().currentUser?.uid ?: return
        viewModelScope.launch {
            val scores = repository.getUserScores(userId)
            val total = scores.size
            val avg = if (total > 0) scores.map { it.score }.average() else 0.0
            val max = scores.maxOfOrNull { it.score } ?: 0

            _stats.value = UserStats(total, avg, max)
        }
    }
}

data class UserStats(
    val quizzesCompleted: Int = 0,
    val averageScore: Double = 0.0,
    val highestScore: Int = 0,
)
