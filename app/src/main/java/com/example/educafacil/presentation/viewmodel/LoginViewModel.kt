package com.example.educafacil.presentation.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.educafacil.data.auth.FirebaseAuthManager
import com.example.educafacil.ui.state.LoginUiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    private val firebaseAuthManager: FirebaseAuthManager
) : ViewModel() {

    private val _uiState = MutableStateFlow(LoginUiState())
    val uiState = _uiState.asStateFlow()

    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading.asStateFlow()

    private val _eventMessage = MutableStateFlow<String?>(null)
    val eventMessage = _eventMessage.asStateFlow()

    private val _loginSuccess = MutableStateFlow(false)
    val loginSuccess: StateFlow<Boolean> = _loginSuccess.asStateFlow()

    init {
        _uiState.update { currentState ->
            currentState.copy(
                onEmailChange = { email ->
                    _uiState.update { it.copy(email = email) }
                },
                onPasswordChange = { password ->
                    _uiState.update { it.copy(password = password) }
                },
            )
        }
    }

    fun login() {
        viewModelScope.launch {
            if (_uiState.value.email.isBlank() || _uiState.value.password.isBlank()) {
                _eventMessage.value = "Preencha todos os campos"
                return@launch
            }
            _isLoading.value = true
            _eventMessage.value = null
            _loginSuccess.value = false

            try {
                val result = firebaseAuthManager
                    .login(_uiState.value.email, _uiState.value.password)
                _loginSuccess.value = result
                if(_loginSuccess.value){
                    _eventMessage.value = "Sucesso ao fazer login"
                }else{
                    _eventMessage.value = "Usuário ou senha incorretos"
                }
            } catch (e: Exception) {
                _eventMessage.value = "Falha no login. Tente novamente."
                Log.e("LoginViewModel", "Falha no login", e)
            } finally {
                _isLoading.value = false
            }
        }
    }
    fun clearEventMessage() {
        _eventMessage.value = null
    }

}
