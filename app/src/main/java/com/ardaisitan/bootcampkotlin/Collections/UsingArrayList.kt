package com.ardaisitan.bootcampkotlin.Collections

fun main() {
    //Kalici bir kayit degildir,calistirinca verileri alır durdururusak bilgiler gider.
    // Tanimlama
    val numbers = ArrayList<Int>()

    val fruits = ArrayList<String>()

    //Veri ekleme
    fruits.add("Elma")
    fruits.add("Muz")
    fruits.add("Kiraz")
    println(fruits)



    //Guncelleme
    fruits[1] = "Yeni Muz"
    println(fruits)

    // Insert
    fruits.add(1, "Portakal")
    println(fruits) // Varolan bilgiyi bozmaz indexine uygun ekleyip diger ogeleri kaydirir.

    //Okuma
    println(fruits[3])
    println(fruits.get(2))

    println("Boyut:${fruits.size}")
    println("Boyut:${fruits.count()}")
    println("Boş kontrol : ${fruits.isEmpty()}")
    println("Kiraz var mi :${fruits.contains("Kiraz")}")
    println("Çilek var mi :${fruits.contains("Çilek")}")

    //Terse cevirme
    fruits.reverse()
    println(fruits)

    //Siralama
    fruits.sort()
    println(fruits)

    for (fruit in fruits) {
        println("$fruit")
    }

    for ((index, fruit) in fruits.withIndex()) {
        println("$index:$fruit")
    }

    fruits.removeAt(2)
    println(fruits)

    fruits.clear()
    println(fruits)



}