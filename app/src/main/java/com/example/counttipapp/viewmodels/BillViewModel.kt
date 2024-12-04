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
        if (newCost == 0.0) {
          _bill.update { currentState -> currentState.copy(cost = newCost, result = 0.0) }
        }
        else {
          _bill.update { currentState -> currentState.copy(cost = newCost) }
        }
    }

    fun changeBillTipPercentage(percentageValue: Float) {
        val newPercentage = percentageValue.toDouble()
        _bill.update { currentState -> currentState.copy(tipPercentage = newPercentage) }
    }

    fun changeBillTip() {
        val newTip = _bill.value.cost * (_bill.value.tipPercentage / 100.00)
        _bill.update { currentState -> currentState.copy(tip = newTip) }
    }

    fun changeBillResult() {
        val newResult = _bill.value.cost + _bill.value.tip
        _bill.update { currentState -> currentState.copy(result = newResult) }
    }
}