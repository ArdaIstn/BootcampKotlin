package com.ardaisitan.bootcampkotlin.OOP.Interface

class A : myInterface {

    override var degisken: Int = 10

    override fun metod1() {
        println("Metod 1 calisti")
    }


    override fun metod2(): String {
        return "Metod 2 calisti"
    }
}