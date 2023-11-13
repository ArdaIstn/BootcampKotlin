package com.ardaisitan.bootcampkotlin.OOP.Inheritance

fun main() {

    val topkapiSaray = Saray(5, 20)

    val bogazVilla = Villa(true, 30)



    println(topkapiSaray.kuleSayisi)
    println(topkapiSaray.pencereSayisi)

    println(bogazVilla.garajVarMi)
    println(bogazVilla.pencereSayisi)

    println("**********************")

    if (topkapiSaray is Saray) {
        println("Saraydir")
    } else {
        println("Saray degildir.")
    }

    // UpCasting
    val ev: Ev = bogazVilla


    // DownCasting
    val ev1 = Ev(6)
    val saray = ev1 as Saray


}



