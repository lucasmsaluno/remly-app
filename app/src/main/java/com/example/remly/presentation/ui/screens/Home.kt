package com.example.remly.presentation.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.remly.presentation.ui.components.Header
import com.example.remly.presentation.ui.components.RemindersList

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Home (
    modifier: Modifier = Modifier,
    navController: NavController
) {
    Column {
        Header()
        RemindersList(navController = navController)
    }
}