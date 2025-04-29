package com.example.educafacil.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educafacil.data.model.Quiz
import com.example.educafacil.domain.usecase.GetQuizUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getQuizUseCase: GetQuizUseCase,
) : ViewModel() {

    private val _quizList = MutableStateFlow<List<Quiz>>(emptyList())
    val quizList: StateFlow<List<Quiz>> = _quizList
    var isLoading by mutableStateOf(false)

    init {
        loadQuizzes()
    }


    private fun loadQuizzes() {
        viewModelScope.launch {
            isLoading = true
            _quizList.value = getQuizUseCase.getAll()
            isLoading = false
        }
    }
}
