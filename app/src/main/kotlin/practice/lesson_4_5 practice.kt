package practice

fun main () {

    println("Наличие повреждений корпуса:")
    val Damage = readln().toBoolean()

    println("Текущий состав экипажа:")
    val NumberOfCrew = readln().toInt()

    println("Количество ящиков с провизией на борту:")
    val AmountOfProvisions = readln().toInt()

    println("Благоприятность метеоусловий:")
    val Weather = readln().toBoolean()

    val analysis = !Damage && NumberOfCrew in 35..70 && AmountOfProvisions > 50 && (Weather || !Weather)
            ||NumberOfCrew == 70 && Weather == true && AmountOfProvisions >= 50

    println("Корабль может отправиться в плавание: $analysis")
}