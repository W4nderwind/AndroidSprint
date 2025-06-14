package practice

fun main () {

    val sunnyWeather = true
    val openAwning = true
    val airHumidity = 20
    val timeOfYear = "зима"

    val dataVerification = sunnyWeather == true && openAwning == true && airHumidity == 20 && timeOfYear !== "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? $dataVerification")



}