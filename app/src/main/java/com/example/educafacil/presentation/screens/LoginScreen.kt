package com.example.educafacil.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.educafacil.presentation.components.BottomLoginSignUp
import com.example.educafacil.presentation.components.ButtonComponents
import com.example.educafacil.presentation.components.ForgotComponents
import com.example.educafacil.presentation.components.TextFieldComponents
import com.example.educafacil.presentation.viewmodel.LoginViewModel

@Composable
fun LoginScreen(viewModel: LoginViewModel, onSignUp: () -> Unit, onLoginSuccess: () -> Unit, onForgotPassword: () -> Unit) {

    if (viewModel.loginSuccess) onLoginSuccess()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LoginContent(
            viewModel = viewModel,
            onForgotPasswordClick = { onForgotPassword() },
            onSignInClick = { viewModel.login() },
            onSignUpClick = { onSignUp() }
        )
    }
}

@Composable
fun LoginContent(
    viewModel: LoginViewModel,
    onForgotPasswordClick: () -> Unit,
    onSignInClick: () -> Unit,
    onSignUpClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Login",
            style = MaterialTheme.typography.displaySmall,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(16.dp))
        LoginFrom(
            viewModel = viewModel,
            onForgotPasswordClick = onForgotPasswordClick,
            onSignInClick = onSignInClick
        )
        BottomLoginSignUp(
            text = "Não tem uma conta? ",
            textNav = "Cadastre-se",
            onNavClick = onSignUpClick
        )
    }
}


@Composable
fun LoginFrom(
    viewModel: LoginViewModel,
    onForgotPasswordClick: () -> Unit,
    onSignInClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TextFieldComponents(
            value = viewModel.email,
            onValueChange = { viewModel.email = it },
            label = "Email",
            placeholder = "Digite seu email",
            leadingIcon = Icons.Outlined.Email,
            trailingIcon = Icons.Rounded.Clear,
            onTrailingIconClick = { viewModel.email = "" }
        )
        TextFieldComponents(
            value = viewModel.password,
            onValueChange = { viewModel.password = it },
            label = "Senha",
            placeholder = "Digite sua senha",
            isPasswordField = true,
            leadingIcon = Icons.Outlined.Lock
        )
        ForgotComponents(onForgotPasswordClick = onForgotPasswordClick )
        ButtonComponents(
            text = "Entrar",
            onClick = onSignInClick,
            cornerRadius = 15,
            isLoading = viewModel.isLoading,
        )
    }
}


