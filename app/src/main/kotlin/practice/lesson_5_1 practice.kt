package org.example.app.practice

fun main(){
    val a = 5
    val b = 3

    println("решите пример: $a+$b")

    val userAnswer = readln().toInt()

    if (userAnswer == a + b)
        println("Добро пожаловать!")
    else
        println("Доступ запрещен.")
}