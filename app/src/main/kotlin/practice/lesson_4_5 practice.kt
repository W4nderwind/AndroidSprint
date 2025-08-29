package practice

fun main () {

    println("Наличие повреждений корпуса:")
    val damage = readln().toBoolean()

    println("Текущий состав экипажа:")
    val numberOfCrew = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val amountOfProvisions = readln().toInt()

    println("Благоприятность метеоусловий:")
    val weather = readln().toBoolean()

    val analysis = !damage && numberOfCrew in 35..70 && amountOfProvisions > 50 && (weather || !weather)
            ||numberOfCrew == 70 && weather == true && amountOfProvisions >= 50

    println("Корабль может отправиться в плавание: $analysis")
}