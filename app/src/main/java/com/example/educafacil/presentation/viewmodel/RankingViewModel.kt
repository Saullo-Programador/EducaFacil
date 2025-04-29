package com.example.educafacil.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educafacil.data.auth.FirebaseAuthManager
import com.example.educafacil.data.model.UserScore
import com.example.educafacil.domain.usecase.GetRankingUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RankingViewModel @Inject constructor(
    private val getRankingUseCase: GetRankingUseCase,
    private val firebaseAuthManager: FirebaseAuthManager
) : ViewModel() {

    var rankingList by mutableStateOf<List<UserScore>>(emptyList())
    var isLoading by mutableStateOf(true)
    val authFire = firebaseAuthManager.authFire

    init {
        loadRanking()
    }

    private fun loadRanking() {
        viewModelScope.launch {
            isLoading = true
            rankingList = getRankingUseCase()
            isLoading = false
        }
    }
}