package practice

fun main() {
    val tables = 13
    val bookedToday = 13
    val bookedTomorrow = 9

    val resultToday = bookedToday < tables
    val resultTomorrow = bookedTomorrow < tables

    println ("Доступность столиков на сегодня: $resultToday,\nДоступность столиков на завтра: $resultTomorrow")

}