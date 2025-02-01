package com.example.remly.presentation.navigation

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.remly.presentation.ui.screens.Home
import com.example.remly.presentation.ui.screens.Login
import com.example.remly.presentation.ui.screens.Reminder

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun AppNavigation () {
    val navController = rememberNavController()

    val currentRoute = navController
        .currentBackStackEntryAsState()
        .value
        ?.destination
        ?.route
        ?: "None"

    Scaffold (
        floatingActionButton = {
            if (currentRoute == "Home") {
                FloatingActionButton(
                    containerColor = MaterialTheme.colorScheme.primary,
                    onClick = { navController.navigate(Screens.ReminderScreen.route) },
                ) {
                    Icon(Icons.Default.Add, contentDescription = "Add Item")
                }
            }
        }
    ) {
        NavHost(navController = navController, startDestination = Screens.LoginScreen.route) {
            composable(Screens.LoginScreen.route) {
                Login()
            }
            composable(Screens.HomeScreen.route) {
                Home(navController = navController)
            }
            composable(Screens.ReminderScreen.route) {
                Reminder(navController = navController)
            }
        }
    }
}