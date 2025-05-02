package com.example.educafacil.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educafacil.data.auth.FirebaseAuthManager
import com.example.educafacil.ui.state.SignUpUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignupViewModel @Inject constructor(
    private val firebaseAuthManager: FirebaseAuthManager
) : ViewModel() {

    private val _uiState = MutableStateFlow(SignUpUiState())
    val uiState: StateFlow<SignUpUiState> = _uiState.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _eventMessage = MutableStateFlow<String?>(null)
    val eventMessage = _eventMessage.asStateFlow()

    private val _signupSuccess = MutableStateFlow(false)
    val signupSuccess: StateFlow<Boolean> = _signupSuccess.asStateFlow()


    init {
        _uiState.update { currentState ->
            currentState.copy(
                onUserChange = {user ->
                    _uiState.update {
                        it.copy ( user = user )
                    }
                },
                onEmailChange = {email ->
                    _uiState.update {
                        it.copy ( email = email )
                    }
                },
                onPasswordChange = {password ->
                    _uiState.update {
                        it.copy ( password = password )
                    }
                },
                onConfirmPasswordChange = {password  ->
                    _uiState.update {
                        it.copy ( confirmPassword = password )
                    }
                }
            )
        }
    }

    fun signup() {
        viewModelScope.launch {
            if (_uiState.value.password != _uiState.value.confirmPassword) {
                _eventMessage.value = "Passwords do not match"
                return@launch
            }
            _isLoading.value = true
            _eventMessage.value = null
            _signupSuccess.value = false

            try {
                val result = firebaseAuthManager
                    .signup(
                        _uiState.value.email,
                        _uiState.value.password,
                        _uiState.value.user
                    )
                _signupSuccess.value = result
                if (_signupSuccess.value) {
                    _eventMessage.value = "Cadastro realizado com sucesso"
                } else {
                    _eventMessage.value = "Erro ao cadastrar"
                }
            } catch (e: Exception) {
                _eventMessage.value = "Falha ao cadastrar. Tente novamente."
                Log.e("SignupViewModel", "Error during signup", e)
            } finally {
                _isLoading.value = false
            }
        }
    }
    fun clearEventMessage(){
        _eventMessage.value = null
    }
}