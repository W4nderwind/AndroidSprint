package practice

fun main () {

    val MinMaxCrew = 35.. 70

    println("Наличие повреждений корпуса:")
    val damage = readln().toBoolean()

    println("Текущий состав экипажа:")
    val numberOfCrew = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val amountOfProvisions = readln().toInt()

    println("Благоприятность метеоусловий:")
    val weather = readln().toBoolean()

    val analysis = !damage && numberOfCrew in MinMaxCrew && amountOfProvisions > MIN_PROVISIONS && (weather || !weather)
            ||numberOfCrew == ALTERNATIVE_CREW && weather == true && amountOfProvisions >= MIN_PROVISIONS

    println("Корабль может отправиться в плавание: $analysis")
}
const val ALTERNATIVE_CREW = 70
const val MIN_PROVISIONS = 50