package practice

import kotlin.math.pow

fun main (){

    val initialAmount = 70000
    val interestRate = 0.167
    val amountOfAccrualPerYear = 1
    val numberOfYears = 20

    val totalAmount = initialAmount * (1 + interestRate / amountOfAccrualPerYear).pow(numberOfYears * amountOfAccrualPerYear)

    val result = "%.3f".format(totalAmount)

    println(result)
}