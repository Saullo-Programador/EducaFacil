package com.example.educafacil

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.educafacil.data.datasource.uploadQuizzesToFirestore
import com.example.educafacil.navigation.AppNavigation
import com.example.educafacil.navigation.Screen
import com.example.educafacil.presentation.viewmodel.AppViewModel
import com.example.educafacil.ui.theme.EducaFacilTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EducaFacilTheme (
                dynamicColor = false,
                darkTheme = false
            ){
                uploadQuizzesToFirestore()  
                val navController = rememberNavController()
                val appViewModel: AppViewModel = viewModel()
                val state by appViewModel.state.collectAsState()
                Surface(
                    modifier = Modifier
                        .windowInsetsPadding(WindowInsets.statusBars)
                        .fillMaxSize(),
                ) {
                    if (state.isLoading){
                        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                            CircularProgressIndicator()
                        }
                    }else {
                        AppNavigation(
                            navController = navController,
                            onQuizSelected = { quizId ->
                                navController.navigate(Screen.Quiz.createRoute(quizId))
                            },
                            startDestination = Screen.Splash.route
                        )
                    }
                }
            }
        }
    }
}