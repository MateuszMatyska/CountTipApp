package com.example.counttipapp.components

import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TipSlider(value: Float, onChange: (Float) -> Unit, modifier: Modifier = Modifier) {
    Slider(value = value, onValueChange = onChange, valueRange = 0f..100f, steps = 9, modifier = modifier)
}