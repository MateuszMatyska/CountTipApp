package com.example.counttipapp.components

import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TipInput(value: String, placeholder: String, onNameChange: (String) -> Unit, modifier: Modifier = Modifier) {
    TextField(value = value, onValueChange = onNameChange, label = {PlaceholderLabel(placeholder)}, modifier=modifier)
}

@Composable
fun PlaceholderLabel(text: String){
    Text(text = text)
}