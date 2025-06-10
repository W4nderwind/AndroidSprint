package practice

fun main() {

    val buff = 0.2
    val crystal = 7
    val iron = 11

    val crystalMiningBuff = (crystal * buff).toInt()
    val ironMiningBuff = (iron * buff).toInt()

    println(crystalMiningBuff)
    println(ironMiningBuff)

}