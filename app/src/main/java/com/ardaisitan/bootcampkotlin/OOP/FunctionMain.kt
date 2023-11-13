package com.ardaisitan.bootcampkotlin.OOP

fun main() {

    val f = Function()
    f.sayHi()

    val result = f.sayHi2()

    println(result)

    f.sayHi3("Mert")
    println("****************")

    val sumResult = f.sumIt(10,20)
    println("sumResult:$sumResult")

    println("******************")
    f.multiply(3,4,"Arda")

    println("************************")

    f.printAllInfo("James","Hetfield","USA",50)
    f.printAllInfo("Arda","Işıtan",age = 24)
    f.printAllInfo("Ayşe","Kara",age = 35, isMan = false)

    println("*******************")

    f.sumIt(1,2,3,4,5)







}