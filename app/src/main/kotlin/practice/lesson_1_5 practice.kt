package practice

fun main (){
    val seconds: Int = 6480
    val minute: Int = seconds / TIME_FRAME
    val hour: Int = minute / TIME_FRAME

    val remainingMinutes = minute % TIME_FRAME
    val remainingSeconds: Int = seconds % TIME_FRAME

    val dateFormat = String.format("%02d:%02d:%02d", hour, remainingMinutes, remainingSeconds)

    println(dateFormat)

}
const val TIME_FRAME = 60