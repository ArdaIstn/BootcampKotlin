package com.ardaisitan.bootcampkotlin.OOP

fun main() {

    val a = ClassA()
    /*
    println(a.x)
    a.normalFunc()

    //Virtual Object -Sanal Nesne
    println(ClassA().x)
    ClassA().normalFunc()
     */


    println(ClassA.x)//Static anlamina geliyor.Parantezsiz olması lazım.
    ClassA.normalFunc()

}