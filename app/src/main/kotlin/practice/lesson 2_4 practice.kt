package practice

fun main() {

    val buff = 20
    val crystal = 7
    val iron = 11

    val buffPercent = buff / 100.0

    val crystalMiningBuff = (crystal * buffPercent).toInt()
    val ironMiningBuff = (iron * buffPercent).toInt()
//    val crystalMiningBuff = (crystal * (buff / 100.0)).toInt()
//    val ironMiningBuff = (iron * (buff / 100.0)).toInt()

    println(crystalMiningBuff)
    println(ironMiningBuff)


}