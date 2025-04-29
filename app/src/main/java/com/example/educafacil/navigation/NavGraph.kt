package com.example.educafacil.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Login : Screen("login")
    object SignUp : Screen("signup")
    object Home : Screen("home")
    object Quiz : Screen("quiz/{quizId}"){
        fun createRoute(quizId: String) = "quiz/$quizId"
    }
    object Ranking : Screen("ranking")
    object Profile : Screen("profile")
    object Settings : Screen("settings")
    object UserState : Screen("user_state")
    object ForgotPassword : Screen("forgot_password")
}