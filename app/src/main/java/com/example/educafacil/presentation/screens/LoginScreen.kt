package com.example.educafacil.presentation.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.educafacil.R
import com.example.educafacil.presentation.components.BottomLoginSignUp
import com.example.educafacil.presentation.components.ButtonComponents
import com.example.educafacil.presentation.components.ForgotComponents
import com.example.educafacil.presentation.components.TextFieldComponents
import com.example.educafacil.presentation.viewmodel.LoginViewModel
import com.example.educafacil.ui.state.LoginUiState

@Composable
fun LoginScreen(viewModel: LoginViewModel, onSignUp: () -> Unit, onLoginSuccess: () -> Unit, onForgotPassword: () -> Unit) {

    val loginSuccess by viewModel.loginSuccess.collectAsState()
    val uiState by viewModel.uiState.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()
    val eventMessage by viewModel.eventMessage.collectAsState()

    val context = LocalContext.current

    LaunchedEffect(eventMessage) {
        eventMessage?.let { message ->
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            viewModel.clearEventMessage()
            if (loginSuccess) {
                onLoginSuccess()
            }
        }
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LoginContent(
            onForgotPasswordClick = { onForgotPassword() },
            onSignInClick = { viewModel.login() },
            onSignUpClick = { onSignUp() },
            uiState = uiState,
            isLoading = isLoading
        )
    }
}

@Composable
fun LoginContent(
    onForgotPasswordClick: () -> Unit,
    onSignInClick: () -> Unit,
    onSignUpClick: () -> Unit,
    uiState: LoginUiState,
    isLoading: Boolean
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_logo_2),
            contentDescription = "Logo",
            modifier = Modifier.size(160.dp)
        )

        Text(
            text = "Login",
            style = MaterialTheme.typography.displaySmall,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(16.dp))
        LoginFrom(
            isLoading = isLoading,
            onForgotPasswordClick = onForgotPasswordClick,
            onSignInClick = onSignInClick,
            uiState = uiState
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
    isLoading: Boolean,
    uiState: LoginUiState,
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
            value = uiState.email,
            onValueChange = { uiState.onEmailChange(it) },
            label = "Email",
            placeholder = "Digite seu email",
            leadingIcon = Icons.Outlined.Email,
            trailingIcon = Icons.Rounded.Clear,
            onTrailingIconClick = { uiState.onEmailChange("") }
        )
        TextFieldComponents(
            value = uiState.password,
            onValueChange = { uiState.onPasswordChange(it) },
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
            isLoading = isLoading,
        )
    }
}


