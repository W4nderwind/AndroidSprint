package org.example.app.practice

fun main(){

    val a = 5
    val b = 32

    println("угадайте 2 числа от 0 до 42")

    val userA = readln().toInt()
    val userB = readln().toInt()

    if (userA == a && userB == b || userB == a && userA == b)
        println("Поздравляем! Вы выиграли главный приз!")
        else if  (userA == a || userA == b || userB == b ||userB == a)
        println("Вы выиграли утешительный приз!")
            else
        println("Неудача!")
    println("Победные числа были $a , $b")
}