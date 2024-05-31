package com.example.counttipapp.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TipLabel(title: String, text: String, modifier: Modifier = Modifier) {
    Row(modifier=modifier, verticalAlignment = Alignment.Bottom) {
        Text(text = "$title:", modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp), fontSize = 20.sp)
        Text(text = text, modifier = Modifier.padding(horizontal = 4.dp, vertical = 0.dp), fontSize = 24.sp)
    }
}