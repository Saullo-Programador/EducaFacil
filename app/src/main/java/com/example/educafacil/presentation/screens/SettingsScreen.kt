package com.example.educafacil.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.educafacil.presentation.components.TopBarComponent
import com.example.educafacil.presentation.viewmodel.SettingViewModel

@Composable
fun SettingsScreen(
    viewModel: SettingViewModel = hiltViewModel(),
    onUserStateChange: () -> Unit,
    onBack: () -> Unit,
    onSignOut: () -> Unit,
) {
    if (viewModel.logoutSuccess) onSignOut()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        TopBarComponent(
            title = "Settings",
            navigationIcon = Icons.AutoMirrored.Filled.KeyboardArrowLeft,
            onNavigationClick = { onBack() }
        )
        SettingContent(
            onUserStateChange = onUserStateChange,
            onSignOut = {viewModel.logout()}
        )
    }
}

@Composable
fun SettingContent(
    onUserStateChange: () -> Unit,
    onSignOut: () -> Unit
){
    Column (
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 10.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ){
        ItemSetting(
            text = "User State",
            onClick = { onUserStateChange() },
            textButton = "Change"
        )
        ItemSetting(
            text = "Sair da Conta",
            onClick = { onSignOut() },
            textButton = "Sair",
            colorClick = Color.Red
        )
    }
}

@Composable
fun ItemSetting(
    text: String,
    onClick: () -> Unit,
    textButton: String,
    colorClick: Color = MaterialTheme.colorScheme.primary
){
    Row (
        Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            text = text,
            fontWeight = FontWeight.SemiBold,
            fontSize = 19.sp,
            color = MaterialTheme.colorScheme.onBackground
        )
        Text(
            text = textButton,
            modifier = Modifier.clickable(
                onClick = { onClick() }
            ),
            style = MaterialTheme.typography.titleMedium,
            color = colorClick
        )

    }
}