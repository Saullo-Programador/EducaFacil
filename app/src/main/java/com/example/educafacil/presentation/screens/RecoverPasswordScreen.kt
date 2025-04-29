package com.example.educafacil.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.rounded.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.educafacil.presentation.components.ButtonComponents
import com.example.educafacil.presentation.components.TextFieldComponents
import com.example.educafacil.presentation.viewmodel.RecoverPasswordViewModel

@Composable
fun RecoverPasswordScreen(
    viewModel: RecoverPasswordViewModel = hiltViewModel(),
    onBackToLogin: () -> Unit
) {
    val email by viewModel.email.collectAsState()
    val message by viewModel.message.collectAsState()
    val loading by viewModel.isLoading.collectAsState()

    if(message.isNotEmpty()){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                imageVector = Icons.Default.CheckCircle,
                contentDescription = null,
                tint = Color(0xFF4CAF50),
                modifier = Modifier.size(100.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text("Link enviado com sucesso!", style = MaterialTheme.typography.headlineSmall)
            Spacer(modifier = Modifier.height(24.dp))
            Button(onClick = onBackToLogin) {
                Text("Voltar para o login")
            }
        }
    }else {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background)
                .padding(32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Recuperar Senha", style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))

            TextFieldComponents(
                value = email,
                onValueChange = { viewModel.setEmail(it) },
                label = "Email",
                placeholder = "Digite seu email",
                leadingIcon = Icons.Outlined.Email,
                trailingIcon = Icons.Rounded.Clear,
                onTrailingIconClick = { viewModel.setEmail("") }
            )

            Spacer(modifier = Modifier.height(10.dp))

            ButtonComponents(
                text = if (loading) "Enviando..." else "Enviar link de recuperação",
                onClick = { viewModel.sendPasswordResetEmail() },
                cornerRadius = 15,
                enabled = !loading,
            )

            Spacer(modifier = Modifier.height(12.dp))

            if (message.isNotEmpty()) {
                Text(message, color = MaterialTheme.colorScheme.primary)
            }

            TextButton(onClick = onBackToLogin) {
                Text("Voltar para login")
            }
        }
    }
}
