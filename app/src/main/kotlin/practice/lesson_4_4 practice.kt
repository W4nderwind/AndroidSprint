package practice

fun main(){

    val trainingDay = 5

    val handsDay = trainingDay % 2 == 1
    val legsDay = !handsDay

    println("""
        Упражнения для рук: $handsDay
        Упражнения для ног: $legsDay
        Упражнения для спины: $legsDay
        Упражнения для пресса: $handsDay
    """.trimIndent())

}