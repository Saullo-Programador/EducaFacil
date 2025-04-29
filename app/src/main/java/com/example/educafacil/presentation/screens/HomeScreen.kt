package com.example.educafacil.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.educafacil.data.model.Quiz
import com.example.educafacil.presentation.components.TopBarComponent
import com.example.educafacil.presentation.components.ViewComponents
import com.example.educafacil.presentation.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    viewModel: HomeViewModel,
    onQuizSelected: (String) -> Unit,
    onSettings: () -> Unit
) {
    val quizList by viewModel.quizList.collectAsState()

    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .fillMaxSize(),
        horizontalAlignment = Alignment .CenterHorizontally
    ) {
        TopBarComponent(
            title = "EducaFacil",
            trailingIcon = Icons.Default.Settings,
            onTrailingIconClick = { onSettings() }
        )
        HomeContent(
            viewModel = viewModel,
            onQuizSelected = onQuizSelected,
            quizList = quizList
        )
    }
}

@Composable
fun HomeContent(
    viewModel: HomeViewModel,
    onQuizSelected: (String) -> Unit,
    quizList: List<Quiz>
){
    Column(
        modifier = Modifier
            .padding(horizontal = 16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        if ( viewModel.isLoading == true && quizList.isEmpty()){
            ViewComponents(text = "Carregando...")
        }else if (quizList.isEmpty()){
            ViewComponents("Nenhum quiz encontrado")
        }else{
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                items(quizList.size) { quiz ->
                    val quiz = quizList[quiz]
                    Card(
                        modifier = Modifier.fillMaxWidth().padding(vertical = 8.dp)
                            .clickable { onQuizSelected(quiz.id) },
                        elevation = CardDefaults.cardElevation(8.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(quiz.title, fontSize = 18.sp, fontWeight = FontWeight.Medium)
                        }
                    }
                }
            }
        }
    }

}