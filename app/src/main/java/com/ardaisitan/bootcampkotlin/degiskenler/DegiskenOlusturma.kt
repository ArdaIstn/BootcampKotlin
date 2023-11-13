package com.ardaisitan.bootcampkotlin.degiskenler

fun main() {
    var studentName = "Arda"
    var studentAge = 23
    var studentLength = 1.98
    var studentsFirstLetter = 'A'
    var studentGoSchool = true

    println(studentName)
    println(studentAge)
    println(studentLength)
    println(studentsFirstLetter)
    println(studentGoSchool)

    var product_id = 3416
    var product_name = "Macbook Pro"
    var product_number = 42999
    var product_owner = "Apple"

    println("Product id:$product_id")
    println("Product name:$product_name")
    println("Product price:$product_number tl")
    println("Product owner:$product_owner")

    println("*******************")
    var a = 20
    var b = 10
    println("Sum:${a + b}")
    println("Substract:${a - b}")
    println("Multiply:${a * b}")
    println("Divide:${a / b}")

    println("**************")
    //Constants(Sabitler)

    val number = 40
    // number = 20


    //Type Casting(Tür Dönüşümü)
    val i = 42
    val d = 78.95

    //Sayısaldan Sayısala Dönüşüm

    //Sayısaldan sayısala dönüşüm yaparken veri kaybına uğrayabiliriz.
    val result1 = i.toDouble()
    val result2 = d.toInt()
    println(result1)//Sadece .0 yaptı
    println(result2)// .95 kısmını attı,veri kaybı oldu,tehlikeli.

    //Sayısaldan Metine Dönüşüm
    val result3 = i.toString()//"42"
    val result4 = d.toString()

    println(result3)
    println(result4)

    //Metinden Sayısala Dönüşüm
    val c = "54.64t"
    val result5 = c.toDouble() // t olduğu için hata alıyoruz.
    println(result5)
    // orNull yapıp sonrasında null check de yapabiliriz.
    //Veya null yapıp sonrasında .let yapabiliriz.




}