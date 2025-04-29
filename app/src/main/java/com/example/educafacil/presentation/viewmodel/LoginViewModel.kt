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
class LoginViewModel @Inject constructor(
    private val firebaseAuthManager: FirebaseAuthManager
) : ViewModel() {

    var email by mutableStateOf("")
    var password by mutableStateOf("")
    var isLoading by mutableStateOf(false)
    var loginSuccess by mutableStateOf(false)
    var errorMessage by mutableStateOf<String?>(null)

    fun login() {
        viewModelScope.launch {
            isLoading = true
            val result = firebaseAuthManager.login(email, password)
            loginSuccess = result
            if (!result) errorMessage = "Login failed. Please try again."
            isLoading = false
        }
    }

    fun isUserLoggedIn(): Boolean = firebaseAuthManager.isLoggedIn()
}
