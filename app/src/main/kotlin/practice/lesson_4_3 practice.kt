package practice

fun main () {

    val sunnyWeather = true
    val openAwning = true
    val airHumidity = 20
    val timeOfYear = "зима"

    val dataVerification = sunnyWeather == CORRECT_WEATHER && openAwning == CORRECT_AWNING && airHumidity == CORRECT_HUMIDITY && timeOfYear != UNFAVORABLE_TIME_OF_YEAR

    println("Благоприятные ли условия сейчас для роста бобовых? $dataVerification")
}
const val CORRECT_WEATHER = true
const val CORRECT_AWNING = true
const val CORRECT_HUMIDITY = 20
const val UNFAVORABLE_TIME_OF_YEAR = "зима"