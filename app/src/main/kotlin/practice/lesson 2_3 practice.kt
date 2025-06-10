package practice

fun main() {

    val hour = 9
    val minute = 39
    val travelTime = 457

    val totalMinutes = hour * 60 + minute + travelTime
    val arrivalHour = totalMinutes / 60
    val arrivalMinute = totalMinutes % 60

    println("$arrivalHour:$arrivalMinute")

}