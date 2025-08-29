package practice

fun main () {

    val progressMove = "D2-D4;0"

    val part = progressMove.split("-",";")
    val start = part[0]
    val end = part[1]
    val number = part[2]

    println("откуда: $start")
    println("куда: $end")
    println("номер хода: $number")


}