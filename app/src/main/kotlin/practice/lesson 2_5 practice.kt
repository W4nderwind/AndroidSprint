package practice

import kotlin.math.pow

fun main (){

    val p = 70000
    val r = 0.167
    val n = 1
    val t = 20

    val s = p * (1 + r/n).pow(t*n)
    val result = "%.3f".format(s)

    println(result)
}