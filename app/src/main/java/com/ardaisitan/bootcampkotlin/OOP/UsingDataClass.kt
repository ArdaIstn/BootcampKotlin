package com.ardaisitan.bootcampkotlin.OOP

fun main() {
    val person1 = User("Arda", "Işıtan", 24, "Turkey")
    println(person1.component1())
    println(person1.component2())
    println(person1.component3())
    println(person1.component4())


    println(person1)

    println()

    val person2 = person1.copy(name = "Burak", surname = "Kaya")
    println(person2.component1())
    println(person2.component2())
    println(person2.component3())
    println(person2.component4())

    println(person2)

    // destructturing declaration


    val (name1, surname1, age1, country1) = person1
    val (name2, surname2, age2, country2) = person2

    println("Name1:$name1,Surname1:$surname1,Age1:$age1,Country1:$country1")
    println("Name2:$name2,Surname2:$surname2,Age2:$age2,Country2:$country2")


}