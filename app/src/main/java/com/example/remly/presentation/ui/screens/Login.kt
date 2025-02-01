package com.example.remly.presentation.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.remly.R
import com.example.remly.presentation.ui.theme.nunitoFontFamily

@Composable
fun Login (
    modifier: Modifier = Modifier
) {
    Column (
        modifier = Modifier.fillMaxSize()
    ) {
        Row (
            modifier = Modifier.fillMaxWidth().padding(vertical = 80.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(R.drawable.notification),
                contentDescription = "Application Icon",
                modifier = Modifier.size(80.dp)
            )
            Text(
                "Remly",
                color = MaterialTheme.colorScheme.primary,
                fontFamily = nunitoFontFamily,
                fontSize = 32.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Column (
            modifier = Modifier.fillMaxSize().padding(30.dp),
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Your Email")
                },
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(modifier = Modifier.size(20.dp))

            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text("Your Password")
                },
                shape = RoundedCornerShape(8.dp)
            )

            Spacer(modifier = Modifier.size(20.dp))

            Text("Create Account")

            Spacer(modifier = Modifier.size(20.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            ) {
                Text("Login In")
            }
        }

    }
}