package com.ardaisitan.bootcampkotlin.OOP

fun main() {
    val result = 5.multiply(2)

    println(result)

    val result2 = 10 multiply 3
    println(result2)


    val result3 = "Arda".downloadImage("12345")

    val result4 = "Mehmet" downloadImage "2468"


}

infix fun Int.multiply(number: Int): Int {
    return this * number//this=Int sinifi
}
infix fun String.downloadImage(imageUrl:String){
    println(this + imageUrl)
}
infix fun String.downloadAnything(anything:String){
    println(this)
}




