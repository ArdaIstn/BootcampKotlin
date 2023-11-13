package com.ardaisitan.bootcampkotlin.OOP

class Function {
    //void-geri donus degeri olmayan

    fun sayHi() {
        val result = "Hi Bro"
        println(result)
    }

    //Return'u olan,geri donus degeri olan
    fun sayHi2(): String {
        val result = "Hi Bro my name is arda"
        return result
    }

    //Parametre
    fun sayHi3(name: String) {
        val result = "Hi $name"
        println(result)
    }

    fun sumIt(number1: Int, number2: Int): Int {
        val sumResult = number1 + number2
        return sumResult
    }

    //OverLoading

    fun multiply(number1: Int, number2: Int) {
        println("Multiply1:${number1 * number2}")
    }

    fun multiply(number1: Double, number2: Int) {
        println("Multiply2:${number1 * number2}")

    }

    fun multiply(number1: Int, number2: Int, name: String) {
        println("Multiply2:${number1 * number2}")
        println("Name:$name")
    }

    fun multiply(number1: Int, number2: Double) {
        println("Multiply3:${number1 * number2}")
    }

    // Name Arguments

    fun printAllInfo(
        name: String,
        surname: String,
        country: String = "Turkey",
        age: Int,
        isMan: Boolean = true
    ) {
        println("Name:$name,Surname:$surname,Age:$age,Country:$country,isMan:$isMan")
    }


    //Vararg Kullanımı
    fun sumIt(vararg numbers: Int) {
        var result = 0
        for (number in numbers) {
            result += number
        }
        println(result)
    }

}