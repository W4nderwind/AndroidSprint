package practice

fun main(){

    val worker = 50
    val intern = 30
    val allStaff = worker + intern
    val workerSalaries = 30000
    val internSalary = 20000
    val allWorkerSalaries = workerSalaries * worker
    val allSalary = allWorkerSalaries + internSalary * intern
    val averageSalary = allSalary / allStaff

    println("Общее количество сотрудников: $allStaff ")
    println("Затраты на зп основных работников: $allWorkerSalaries ")
    println("Общее количество затрат на зп: $allSalary ")
    println("Средняя зарплата человека среди всех сотрудников: $averageSalary ")

}