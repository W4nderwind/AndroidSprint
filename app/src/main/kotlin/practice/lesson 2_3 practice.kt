package practice

fun main() {

    val hour = 9
    val minute = 39
    val travelTime = 457

    val totalMinutes = hour * TIME_FRAME1 + minute + travelTime
    val arrivalHour = totalMinutes / TIME_FRAME1
    val arrivalMinute = totalMinutes % TIME_FRAME1

    println("$arrivalHour:$arrivalMinute")

}
const val TIME_FRAME1 = 60