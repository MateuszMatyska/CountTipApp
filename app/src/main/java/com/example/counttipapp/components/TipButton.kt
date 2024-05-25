package com.example.counttipapp.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun TipButton(title: String, onPressAction: () -> Unit, enabled: Boolean, modifier: Modifier = Modifier) {
    Button(onClick = {onPressAction()}, enabled = enabled, modifier = modifier ) {
        Text(text = title, fontSize = 24.sp)
    }
}