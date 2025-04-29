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
import androidx.compose.material.icons.outlined.Person
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
import com.example.educafacil.presentation.components.TextFieldComponents
import com.example.educafacil.presentation.viewmodel.SignupViewModel


@Composable
fun SignUpScreen(viewModel: SignupViewModel, onLogin: () -> Unit, onSignUpSuccess: () -> Unit) {

    if (viewModel.signupSuccess) onSignUpSuccess()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SignUpContent(
            viewModel = viewModel,
            onSignInClick = onLogin,
            onSignUpClick = {
                viewModel.signup()
            }
        )
    }
}


@Composable
fun SignUpContent(
    viewModel: SignupViewModel,
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
            text = "Cadastrar",
            style = MaterialTheme.typography.displaySmall,
            fontWeight = FontWeight.Bold
        )
        Spacer(Modifier.height(16.dp))
        SignUpFrom(
            viewModel = viewModel,
            onSignUpClick = onSignUpClick,
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
    viewModel: SignupViewModel,
    onSignUpClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TextFieldComponents(
            value = viewModel.username,
            onValueChange = { viewModel.username = it },
            label = "Nome",
            placeholder = "Digite seu nome",
            leadingIcon = Icons.Outlined.Person,
            trailingIcon = Icons.Rounded.Clear,
            onTrailingIconClick = { viewModel.email = "" }
        )
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
            leadingIcon = Icons.Outlined.Lock,
        )
        TextFieldComponents(
            value = viewModel.confirmPassword,
            onValueChange = { viewModel.confirmPassword = it },
            label = "Confirmar Senha",
            placeholder = "Confirme sua senha",
            isPasswordField = true,
            leadingIcon = Icons.Outlined.Lock,
        )
        ButtonComponents(
            text = "Cadastrar",
            onClick = onSignUpClick,
            cornerRadius = 15,
            isLoading = viewModel.isLoading
        )
    }
}
