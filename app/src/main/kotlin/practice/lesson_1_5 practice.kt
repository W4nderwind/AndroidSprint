package practice

fun main (){
    val seconds: Int = 6480
    val minute: Int = seconds / timeFrame
    val hour: Int = minute / timeFrame

    val remainingMinutes = minute % timeFrame
    val remainingSeconds: Int = seconds % timeFrame

    val dateFormat = String.format("%02d:%02d:%02d", hour, remainingMinutes, remainingSeconds)

    println(dateFormat)




}
const val timeFrame = 60