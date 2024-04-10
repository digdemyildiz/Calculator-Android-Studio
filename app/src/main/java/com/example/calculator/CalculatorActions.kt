package com.example.calculator

sealed class CalculatorActions {
    data class Number(val number: Int): CalculatorActions()
    object Clear: CalculatorActions()
    object DeleteAll: CalculatorActions()
    object DecimalPoint: CalculatorActions()
    object Calculate: CalculatorActions()
    data class Operation(val operation: CalculatorOperations): CalculatorActions()
}