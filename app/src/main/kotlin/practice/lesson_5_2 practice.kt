package org.example.app.practice

fun main (){

    print("Укажите свой год рождения: ")

    val userYear = readln().toInt()

    if (ADULT<= YEAR - userYear)
        println("Показать экран со скрытым контентом")
    else
        println("Выход на главный экран")
}
const val ADULT = 18
const val YEAR = 2025
