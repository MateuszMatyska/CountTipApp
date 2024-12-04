package com.example.counttipapp.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.counttipapp.components.TipButton
import com.example.counttipapp.components.TipLabel
import com.example.counttipapp.viewmodels.BillViewModel

@Composable
fun Result(viewModel: BillViewModel, modifier: Modifier = Modifier) {
    val bill = viewModel.bill.collectAsState().value
    Column(modifier) {
        TipLabel(title = "Full Cost is", text = " ${"%.2f".format(bill.result)} ;-", modifier=Modifier.padding(10.dp))
        Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
            TipButton(title = "Count Result", onPressAction = { viewModel.changeBillResult() }, enabled = bill.cost > 0.0, modifier = Modifier.padding(horizontal = 10.dp, vertical = 20.dp))
        }
    }
}