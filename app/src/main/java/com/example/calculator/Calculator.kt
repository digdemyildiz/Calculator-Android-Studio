package com.example.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.calculator.ui.theme.Blue
import com.example.calculator.ui.theme.Purple
import com.example.calculator.ui.theme.PurpleLight

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorActions) -> Unit
){
    Box(modifier = modifier){
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        ){
            Text(
                text = state.number1 + (state.operation ?: "") + state.number2,
                textAlign = TextAlign.End,
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                maxLines = 2
            )

            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ){
                CalculatorButton(
                    text = "AC",
                    modifier = Modifier
                        .background(PurpleLight)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.DeleteAll)
                    }
                )

                CalculatorButton(
                    text = "Del",
                    modifier = Modifier
                        .background(PurpleLight)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Delete)
                    }
                )

                CalculatorButton(
                    text = "/",
                    modifier = Modifier
                        .background(Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperations.Divide))
                    }
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ){
                CalculatorButton(
                    text = "7",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(7))
                    }
                )

                CalculatorButton(
                    text = "8",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(8))
                    }
                )

                CalculatorButton(
                    text = "9",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(9))
                    }
                )

                CalculatorButton(
                    text = "x",
                    modifier = Modifier
                        .background(Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperations.Multiply))
                    }
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ){
                CalculatorButton(
                    text = "4",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(4))
                    }
                )

                CalculatorButton(
                    text = "5",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(5))
                    }
                )

                CalculatorButton(
                    text = "6",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(6))
                    }
                )

                CalculatorButton(
                    text = "-",
                    modifier = Modifier
                        .background(Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperations.Substract))
                    }
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ){
                CalculatorButton(
                    text = "1",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(1))
                    }
                )

                CalculatorButton(
                    text = "2",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(2))
                    }
                )

                CalculatorButton(
                    text = "3",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Number(3))
                    }
                )

                CalculatorButton(
                    text = "+",
                    modifier = Modifier
                        .background(Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Operation(CalculatorOperations.Add))
                    }
                )
            }

            Row(
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing),
                modifier = Modifier.fillMaxWidth()
            ){
                CalculatorButton(
                    text = "0",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onAction(CalculatorActions.Number(0))
                    }
                )

                CalculatorButton(
                    text = ".",
                    modifier = Modifier
                        .background(Purple)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.DecimalPoint)
                    }
                )

                CalculatorButton(
                    text = "=",
                    modifier = Modifier
                        .background(Blue)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onAction(CalculatorActions.Calculate)
                    }
                )
            }
        }
    }
}



