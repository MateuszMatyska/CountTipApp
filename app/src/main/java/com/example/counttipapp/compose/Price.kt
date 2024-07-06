package com.example.counttipapp.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import com.example.counttipapp.components.TipInput
import com.example.counttipapp.viewmodels.BillViewModel


@Composable
fun Price(viewModel: BillViewModel, modifier: Modifier = Modifier ) {
    val bill = viewModel.bill.collectAsState().value
    Row(modifier = modifier){
      TipInput(value = bill.cost.toString(), placeholder = "Enter Bill Cost", onNameChange = viewModel::changeBillCost)
    }
}