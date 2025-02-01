package com.example.remly.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.remly.presentation.ui.theme.nunitoFontFamily
import com.example.remly.presentation.viewmodels.ReminderViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun CustomTimePicker (
    modifier: Modifier = Modifier,
    reminderViewModel: ReminderViewModel = koinViewModel()
) {

    Column (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier.padding(45.dp)
        ) {
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(onClick = { reminderViewModel.updateHours("increase") }) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowUp,
                        contentDescription = "Increase Hours",
                        tint = Color.White
                    )
                }
                Text(
                    reminderViewModel.hours,
                    fontFamily = nunitoFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 50.sp
                )
                IconButton(onClick = { reminderViewModel.updateHours("decrease")  }) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowDown,
                        contentDescription = "Decrease Hours",
                        tint = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.size(30.dp))

            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(onClick = { reminderViewModel.updateMinutes("increase")  }) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowUp,
                        contentDescription = "Increase Hours",
                        tint = Color.White
                    )
                }
                Text(
                    reminderViewModel.minutes,
                    fontFamily = nunitoFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 50.sp
                )
                IconButton(onClick = { reminderViewModel.updateMinutes("decrease")  }) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowDown,
                        contentDescription = "Increase Hours",
                        tint = Color.White
                    )
                }
            }

            Spacer(modifier = Modifier.size(30.dp))

            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton(onClick = { reminderViewModel.updateDayPeriod()  }) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowUp,
                        contentDescription = "Change Day Period",
                        tint = Color.White
                    )
                }
                Text(
                    reminderViewModel.dayPeriod,
                    fontFamily = nunitoFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 50.sp
                )
                IconButton(onClick = { reminderViewModel.updateDayPeriod()  }) {
                    Icon(
                        imageVector = Icons.Filled.KeyboardArrowDown,
                        contentDescription = "Change Day Period",
                        tint = Color.White
                    )
                }
            }
        }
    }
}