package com.example.counttipapp.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun TipInput(value: String, placeholder: String, onNameChange: (String) -> Unit, modifier: Modifier = Modifier) {
    TextField(value = value, onValueChange = onNameChange,keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number), label = {PlaceholderLabel(placeholder)}, modifier=modifier)
}

@Composable
fun PlaceholderLabel(text: String){
    Text(text = text)
}