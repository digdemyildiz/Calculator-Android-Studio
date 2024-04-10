package com.example.calculator

sealed class CalculatorOperations(val operator: String) {
    object Add: CalculatorOperations("+")
    object Substract: CalculatorOperations("-")
    object Multiply: CalculatorOperations("x")
    object Divide: CalculatorOperations("/")
}