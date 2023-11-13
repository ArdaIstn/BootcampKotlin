package com.ardaisitan.bootcampkotlin.OOP

class Car(var name: String, var color: String, var speed: Int, var isWorking: Boolean) {


    init {
        println("İnit block is working.")
    }


    constructor(name: String, color: String, speed: Int, isWorking: Boolean, price: String)
            : this(name, color, speed, isWorking) {
        "2. constructor is working ".printLog()

    }

}

 fun String.printLog(){
    println(this)
}