package practice

fun main (){

    val numberOfStudents = 4
    val assessmentIvan = 3
    val assessmentAnna = 4
    val assessmentBogdan = 3
    val assessmentKirill = 5

    val arithmeticMean = (assessmentIvan + assessmentAnna + assessmentBogdan + assessmentKirill).toDouble() / numberOfStudents

    println(arithmeticMean)
}