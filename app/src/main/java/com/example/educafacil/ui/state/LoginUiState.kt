package com.example.educafacil.ui.state

data class LoginUiState (
    val email: String = "",
    val password: String = "",
    val onEmailChange: (String) -> Unit = {},
    val onPasswordChange: (String) -> Unit = {},
    val isResetEmailSent: Boolean = false
)