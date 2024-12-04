package com.example.counttipapp.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.counttipapp.components.TipLabel
import com.example.counttipapp.components.TipSlider
import com.example.counttipapp.viewmodels.BillViewModel

@Composable
fun Tip(viewModel: BillViewModel, modifier: Modifier = Modifier) {
    val bill = viewModel.bill.collectAsState().value

    SideEffect {
        viewModel.changeBillTip()
    }

    Column(modifier){
        TipSlider(value = bill.tipPercentage.toFloat(), onChange = {viewModel.changeBillTipPercentage(it)})
        TipLabel(title = "Tip percentage", text = " ${"%.2f".format(bill.tipPercentage.toFloat())} %", modifier=Modifier.padding(10.dp))
        TipLabel(title = "Tip is", text = " ${"%.2f".format(bill.tip)} ;-", modifier=Modifier.padding(10.dp))
    }
}