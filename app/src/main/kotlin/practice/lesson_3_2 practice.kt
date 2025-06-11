package practice

fun main(){

    val surname = "Андреева"
    val marriedSurname = "Сидорова"
    val name = "Татьяна"
    val patronymic = "Сергеевна"
    val age20 = 20
    val age22 = 22

    val fullName20 = "$surname $name $patronymic, $age20"
    println(fullName20)

    val fullName22 = "$marriedSurname $name $patronymic, $age22"
    println(fullName22)

//    println("$surname $name $patronymic, $age20")
//
//    println("$marriedSurname $name $patronymic, $age22")
}