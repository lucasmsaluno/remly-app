package com.example.remly.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.outlined.WbSunny
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.remly.presentation.ui.theme.nunitoFontFamily

@Composable
fun Header (
    modifier: Modifier = Modifier
) {
    val gradient = Brush.verticalGradient(
        colorStops = arrayOf(
            0f to MaterialTheme.colorScheme.primary,
            0.6f to MaterialTheme.colorScheme.primary,
            0.5f to Color.White,
            1f to Color.White
        ),
        startY = 0f,
        endY = 800f
    )

    Column (
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primary)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    top = 50.dp,
                    start = 20.dp,
                    end = 20.dp,
                    bottom = 20.dp
                ),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Olá, Lucas",
                fontFamily = nunitoFontFamily,
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 26.sp
            )
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.WbSunny,
                    contentDescription = "Change Theme Button",
                    tint = Color.White
                )
            }
        }
    }
}