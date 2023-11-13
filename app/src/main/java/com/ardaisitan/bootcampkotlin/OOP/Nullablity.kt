package com.ardaisitan.bootcampkotlin.OOP

fun main() {
    //Nullabe - Null Safety - Optional(Swift)


    //Defining
    var str: String? = null



    //str = "arda"

    //Using Methods
    println("1:${str?.trim()}")

    //Using Methods
    //println("2:${str!!.trim()}")

    //Using Methods
    if (str != null) {
        println("2:${str.trim()}")
    } else {
        println("Sonuç nulldur.")
    }

    //Using Methods
    str?.let {
        println("3:${it.trim()}")
    }

    str?.let { println("Not Null") } ?: println("Null")





}