package com.example.educafacil.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.educafacil.presentation.screens.HomeScreen
import com.example.educafacil.presentation.screens.LoginScreen
import com.example.educafacil.presentation.screens.QuizScreen
import com.example.educafacil.presentation.screens.RankingScreen
import com.example.educafacil.presentation.screens.RecoverPasswordScreen
import com.example.educafacil.presentation.screens.SettingsScreen
import com.example.educafacil.presentation.screens.SignUpScreen
import com.example.educafacil.presentation.screens.SplashScreen
import com.example.educafacil.presentation.screens.UserStatsScreen
import com.example.educafacil.presentation.viewmodel.AppViewModel

@Composable
fun AppNavigation(
    navController: NavHostController,
    onQuizSelected: (String) -> Unit,
    startDestination: String,
) {

    NavHost( navController = navController, startDestination = startDestination) {

        composable(Screen.Splash.route) {
            val appViewModel: AppViewModel = viewModel()
            val state by appViewModel.state.collectAsState()
            SplashScreen(
                onTimeout = {
                    if (state.user != null) {
                        navController.navigate(Screen.Home.route) {
                            popUpTo(Screen.Splash.route) { inclusive = true }
                        }
                    } else {
                        navController.navigate(Screen.Login.route) {
                            popUpTo(Screen.Splash.route) { inclusive = true }
                        }
                    }
                }
            )
        }
        composable(Screen.Login.route) {
            LoginScreen(
                viewModel = hiltViewModel(),
                onLoginSuccess = { navController.navigate(Screen.Home.route) },
                onForgotPassword = { navController.navigate(Screen.ForgotPassword.route) },
                onSignUp = { navController.navigate(Screen.SignUp.route) }
            )
        }
        composable(Screen.Home.route) {
            HomeScreen(
                viewModel = hiltViewModel(),
                onQuizSelected = onQuizSelected,
                onSettings = {navController.navigate(Screen.Settings.route)}
            )
        }
        composable(Screen.SignUp.route) {
            SignUpScreen(
                viewModel = hiltViewModel(),
                onLogin = {navController.navigate(Screen.Login.route)},
                onSignUpSuccess = {navController.navigate(Screen.Login.route)}
            )
        }
        composable(
            Screen.Quiz.route,
            arguments = listOf(navArgument ("quizId") { type = NavType.StringType })
        ) { backStackEntry ->
            val quizId = backStackEntry.arguments?.getString("quizId") ?: return@composable
            QuizScreen(
                viewModel = hiltViewModel(),
                quizId = quizId,
                onFinish = { navController.navigate(Screen.Home.route) },
                onViewRanking = { navController.navigate(Screen.Ranking.route) }
            )
        }
        composable(Screen.Ranking.route) {
            RankingScreen()
        }
        composable(Screen.Settings.route) {
            SettingsScreen(
                onUserStateChange = {navController.navigate(Screen.UserState.route)},
                onSignOut = { navController.navigate(Screen.Login.route){popUpTo(0) } },
                onBack = { navController.popBackStack() }
            )
        }
        composable(Screen.UserState.route) {
            UserStatsScreen(
                onBack = { navController.popBackStack() }
            )
        }
        composable(Screen.ForgotPassword.route) {
            RecoverPasswordScreen (onBackToLogin = { navController.popBackStack() })
        }
    }
}
