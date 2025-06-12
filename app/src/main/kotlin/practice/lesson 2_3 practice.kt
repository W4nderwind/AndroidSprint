package practice

fun main() {

    val hour = 9
    val minute = 39
    val travelTime = 457

    val totalMinutes = hour * TIME_FRAME + minute + travelTime
    val arrivalHour = totalMinutes / TIME_FRAME
    val arrivalMinute = totalMinutes % TIME_FRAME

    println("$arrivalHour:$arrivalMinute")

}
const val TIME_FRAME = 60