package org.example.app.practice

import kotlin.random.Random

    fun main() {
        val winNumbers = List(3) { Random.nextInt(0, 43) }
        val userNumbers = mutableListOf<Int>()

        println("Введите 3 числа от 0 до 42:")

        for (i in 1..3) {
            print("Число $i: ")
            val userNumbers = readln().toInt()
        }
        val matches = winNumbers.intersect(userNumbers.toSet())
        val matchCount = matches.size

        when (matchCount) {
            3 -> println("Поздравляем! Вы угадали все числа и выиграли ДЖЕКПОТ!")
            2 -> println("Отлично! Вы угадали два числа и получаете крупный приз!")
            1 -> println("Вы угадали одно число. Получаете утешительный приз.")
            else -> println("К сожалению, вы не угадали ни одного числа.")
        }
        println("Выигрышные числа: $winNumbers")
    }


