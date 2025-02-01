package com.example.remly.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.remly.presentation.viewmodels.ReminderViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun ReminderForm (
    modifier: Modifier = Modifier,
    navController: NavController,
    reminderViewModel: ReminderViewModel = koinViewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(20.dp))
        ) {
            Column (
                modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxSize()
                    .padding(20.dp)
            ) {
                OutlinedTextField(
                    value = reminderViewModel.taskInput,
                    onValueChange = { reminderViewModel.updateTaskInput(it) },
                    modifier = Modifier.fillMaxWidth(),
                    label = {
                        Text("Insert the Reminder Name")
                    },
                    shape = RoundedCornerShape(20.dp)
                )

                Spacer(modifier = Modifier.size(40.dp))

                Text("Select the days of the task")

                Spacer(modifier = Modifier.size(8.dp))

                DayPicker()

                Spacer(modifier = Modifier.weight(1f))

                Row (
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Button(
                        onClick = {
                            navController.popBackStack()
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Red
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("Cancel")
                    }
                    Button(
                        onClick = {
                            // create or edit reminder
                        },
                        shape = RoundedCornerShape(12.dp)
                    ) {
                        Text("Create New Reminder")
                    }
                }
            }
        }
    }
}