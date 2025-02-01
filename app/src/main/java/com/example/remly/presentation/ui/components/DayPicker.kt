package com.example.remly.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.remly.presentation.ui.theme.nunitoFontFamily

@Composable
fun DayPicker(
    modifier: Modifier = Modifier
) {
    val selectedDays = remember { mutableStateListOf<Int>() }
    val days = listOf("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        days.forEachIndexed { index, day ->
            val isSelected = index in selectedDays
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .border(
                        1.dp,
                        if (isSelected) MaterialTheme.colorScheme.primary else Color.LightGray,
                        CircleShape
                    )
                    .size(35.dp)
                    .clickable {
                        if (isSelected) {
                            selectedDays.remove(index)
                        } else {
                            selectedDays.add(index)
                        }
                    },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = day, // Show only the letter (M, T, W...)
                    fontSize = 14.sp,
                    fontFamily = nunitoFontFamily,
                    fontWeight = FontWeight.Bold,
                    color = if (isSelected) MaterialTheme.colorScheme.primary else Color.Black
                )
            }
        }
    }
}
