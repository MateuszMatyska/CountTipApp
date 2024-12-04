package com.example.counttipapp.compose

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.counttipapp.ui.theme.CountTipAppTheme
import com.example.counttipapp.viewmodels.BillViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MainScreen() {
    val viewModel = BillViewModel()
    CountTipAppTheme{
        Scaffold(modifier = Modifier.fillMaxSize()) {
            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, start = 10.dp), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {
                Column(modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "Count Tip Application", color = MaterialTheme.colorScheme.surface, style = TextStyle(
                        fontSize = 32.sp,
                        shadow = Shadow(
                            color = MaterialTheme.colorScheme.secondary, offset = Offset(5.0f, 10.0f), blurRadius = 3f
                        )
                    )
                    )
                }
                Price(viewModel, modifier = Modifier.padding(10.dp))
                Tip(viewModel, modifier = Modifier.padding(10.dp))
                Result(viewModel, modifier = Modifier.padding(horizontal = 10.dp, vertical = 20.dp))
            }
        }
    }
}