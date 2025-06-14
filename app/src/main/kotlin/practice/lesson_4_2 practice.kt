package practice

fun main () {

    val maxWeight = 100
    val minWeight = 35
    val maxVolume = 100

    val cargoVolume1 = 80
    val cargoWeight1 = 20

    val cargoVolume2 = 100
    val cargoWeight2 = 50

    println("Груз с весом ${cargoWeight1}кг и объемом ${cargoVolume1}л соответствует категории : " +
            "${cargoWeight1 > minWeight && cargoWeight1 <= maxWeight && cargoVolume1 < maxVolume}")

    println("Груз с весом ${cargoWeight2}кг и объемом ${cargoVolume2}л соответствует категории : " +
            "${cargoWeight2 > minWeight && cargoWeight2 <= maxWeight && cargoVolume2 < maxVolume}")



}