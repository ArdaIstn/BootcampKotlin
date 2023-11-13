package com.ardaisitan.bootcampkotlin.Collections

fun main() {

    val iller = HashMap<Int, String>()

    iller.put(16, "Bursa")
    iller.put(34, "İstanbul")
    iller[6] = "Ankara"

    println(iller)

    println(iller[16])

    iller.put(16, "Yeni Bursa")
    println(iller)

    println(iller.size)
    println(iller.isEmpty())

    println(iller.put(55, "Samsun"))

    for ((key, value) in iller) {
        println("Key:$key,Value:$value")
    }
    println(iller.containsKey(34))
    println(iller.containsValue("Samsun"))
    println(iller.containsKey(15))

    iller.remove(34)
    println(iller)

    iller.clear()
    println(iller)


}