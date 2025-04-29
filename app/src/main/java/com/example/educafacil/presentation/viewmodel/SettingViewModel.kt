package com.example.educafacil.presentation.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educafacil.data.auth.FirebaseAuthManager
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SettingViewModel @Inject constructor(
    private val firebaseAuthManager: FirebaseAuthManager
) : ViewModel() {
    var isLoading by mutableStateOf(false)
    var logoutSuccess by mutableStateOf(false)

    fun logout() {
        viewModelScope.launch {
            isLoading = true
            firebaseAuthManager.logout()
            logoutSuccess = true
            isLoading = false
        }
    }
}
