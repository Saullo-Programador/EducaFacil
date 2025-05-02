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
import androidx.compose.material.icons.outlined.Person
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
import com.example.educafacil.presentation.components.TextFieldComponents
import com.example.educafacil.presentation.viewmodel.SignupViewModel
import com.example.educafacil.ui.state.SignUpUiState


@Composable
fun SignUpScreen(viewModel: SignupViewModel, onLogin: () -> Unit, onSignUpSuccess: () -> Unit) {

    val uiState by viewModel.uiState.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()
    val signupSuccess by viewModel.signupSuccess.collectAsState()
    val eventMessage by viewModel.eventMessage.collectAsState()

    val context = LocalContext.current
    LaunchedEffect(eventMessage) {
        eventMessage?.let { message ->
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
            viewModel.clearEventMessage()
            if (signupSuccess) onSignUpSuccess()
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SignUpContent(
            uiState = uiState,
            isLoading = isLoading,
            onSignInClick = onLogin,
            onSignUpClick = {
                viewModel.signup()
            }
        )
    }
}


@Composable
fun SignUpContent(
    uiState: SignUpUiState,
    isLoading: Boolean,
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
        Image(
            painter = painterResource(id = R.drawable.ic_logo_2),
            contentDescription = "Logo",
            modifier = Modifier
                .padding(bottom = 5.dp)
                .size(160.dp)
        )

        Text(
            text = "Cadastrar",
            style = MaterialTheme.typography.displaySmall,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(16.dp))
        SignUpFrom(
            onSignUpClick = onSignUpClick,
            isLoading = isLoading,
            uiState = uiState
        )
        BottomLoginSignUp(
            text = "Não tem uma conta? ",
            textNav = "Entrar",
            onNavClick = onSignInClick
        )
    }

}


@Composable
fun SignUpFrom(
    isLoading: Boolean,
    onSignUpClick: () -> Unit,
    uiState: SignUpUiState
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TextFieldComponents(
            value = uiState.user,
            onValueChange = { uiState.onUserChange(it) },
            label = "Nome",
            placeholder = "Digite seu nome",
            leadingIcon = Icons.Outlined.Person,
            trailingIcon = Icons.Rounded.Clear,
            onTrailingIconClick = { uiState.onUserChange("") }
        )
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
            leadingIcon = Icons.Outlined.Lock,
        )
        TextFieldComponents(
            value = uiState.confirmPassword,
            onValueChange = { uiState.onConfirmPasswordChange(it) },
            label = "Confirmar Senha",
            placeholder = "Confirme sua senha",
            isPasswordField = true,
            leadingIcon = Icons.Outlined.Lock,
        )
        ButtonComponents(
            text = "Cadastrar",
            onClick = onSignUpClick,
            cornerRadius = 15,
            isLoading = isLoading
        )
    }
}
