package com.ardaisitan.bootcampkotlin.OOP

fun main() {
    val person = printNames()

    val result1 = person.person1("Arda")
    println(result1)

    val result2 = person.person2("Burak")
    println(result2)

    println(person person1 "Arda")
    println(person person1 "Burak")


}

class printNames {
    infix fun person1(name: String): String {
        return name
    }

    infix fun person2(name: String): String {
        return name
    }


}