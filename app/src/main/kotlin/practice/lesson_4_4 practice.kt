package practice

fun main(){

    val trainingDay = 5

    val handsDay = trainingDay % 2 == 1

    println("""
        Упражнения для рук: $handsDay
        Упражнения для ног: ${!handsDay}
        Упражнения для спины: ${!handsDay}
        Упражнения для пресса: $handsDay
    """.trimIndent())

}