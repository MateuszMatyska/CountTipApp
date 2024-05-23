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

    fun changeBillCost(costValue: Double) {
        _bill.update { currentState -> currentState.copy(
            cost = costValue,
            tipPercentage = currentState.tipPercentage,
            tip = currentState.tip,
            result = currentState.result
        ) }
    }

    fun changeBillTipPercentage(percentageValue: Double) {
        _bill.update { currentState -> currentState.copy(
            cost = currentState.cost,
            tipPercentage = percentageValue,
            tip = currentState.tip,
            result = currentState.result
        ) }
    }

    fun changeBillTip(tipValue: Double) {
        _bill.update { currentState -> currentState.copy(
            cost = currentState.cost,
            tipPercentage = currentState.tipPercentage,
            tip = tipValue,
            result = currentState.result
        ) }
    }

    fun changeBillResult(resultValue: Double) {
        _bill.update { currentState -> currentState.copy(
            cost = currentState.cost,
            tipPercentage = currentState.tipPercentage,
            tip = currentState.tip,
            result = resultValue
        ) }
    }
}