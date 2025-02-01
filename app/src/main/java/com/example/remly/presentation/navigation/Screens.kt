package com.example.remly.presentation.navigation

sealed class Screens (val route: String) {
    data object HomeScreen: Screens("Home")
    data object ReminderScreen: Screens("Reminder")
    data object LoginScreen: Screens("Login")
}