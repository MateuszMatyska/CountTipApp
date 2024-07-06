package com.example.counttipapp.viewmodels

import androidx.lifecycle.ViewModel
import com.example.counttipapp.data.Bill
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BillViewModel: ViewModel() {
    private val _bill = MutableStateFlow(Bill())
    val bill: StateFlow<Bill> = _bill.asStateFlow()

    fun changeBillCost(costValue: String) {
        val newCost = costValue.toDouble()
        _bill.update { currentState -> currentState.copy(cost = newCost) }
    }

    fun changeBillTipPercentage(percentageValue: String) {
        val newPercentage = percentageValue.toDouble()
        _bill.update { currentState -> currentState.copy(tipPercentage = newPercentage) }
    }

    fun changeBillTip(tipValue: String) {
        val newTip = _bill.value.cost * _bill.value.tipPercentage
        _bill.update { currentState -> currentState.copy(tip = newTip) }
    }

    fun changeBillResult(resultValue: String) {
        val newResult = _bill.value.cost + _bill.value.tip
        _bill.update { currentState -> currentState.copy(result = newResult) }
    }
}