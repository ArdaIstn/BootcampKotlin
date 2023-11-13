package com.ardaisitan.bootcampkotlin.OOP.Package2

import com.ardaisitan.bootcampkotlin.OOP.Package1.A

class B {

    fun classAFunc() {
        val example = A()


        println(example.defaultValue)
        println(example.publicValue)
        println(example.internalValue)
    }

}