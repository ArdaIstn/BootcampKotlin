package com.ardaisitan.bootcampkotlin.Collections

fun main() {
    //Hashset'in array listten farki  icerisine deger aktardigimizda icini karistirir verileri ekledigimizde sirayla gostermez.
    // 2. olarak hashset'e tekrar ayni veriyi ekleyemeyiz.

    val meyveler = HashSet<String>()

    meyveler.add("Elma")
    meyveler.add("Kiraz")
    meyveler.add("Muz")
    println(meyveler)

    meyveler.add("Amasya Elması")
    println(meyveler)


    println(meyveler.elementAt(1))
    println(meyveler.size)
    println(meyveler.isEmpty())

    for (meyve in meyveler) {
        println(meyve)
    }

    for ((index, meyve) in meyveler.withIndex()) {
        println("İndex:$index,Meyve:$meyve")
    }

    meyveler.remove("Elma")
    println(meyveler)



    meyveler.clear()
    println(meyveler)

}