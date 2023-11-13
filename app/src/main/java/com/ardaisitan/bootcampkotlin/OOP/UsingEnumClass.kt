package com.ardaisitan.bootcampkotlin.OOP

fun main() {
    ucretHesapla(100, KonserveBoyutu.KUCUK)
    ucretHesapla(200, KonserveBoyutu.ORTA)
    ucretHesapla(300, KonserveBoyutu.BUYUK)
    println("************************")

    println("Seçilen Takim:${Teams.FENERBAHCE} Yıldız Sayısı:${showStars(Teams.FENERBAHCE)}")
    println("Seçilen Takim:${Teams.GALATASARAY} Yıldız Sayısı:${showStars(Teams.GALATASARAY)}")
    println("Seçilen Takim:${Teams.BESIKTAS} Yıldız Sayısı:${showStars(Teams.BESIKTAS)}")
    println("Seçilen Takim:${Teams.GALATASARAY} Yıldız Sayısı:${showStars(Teams.GALATASARAY)}")

}

fun ucretHesapla(adet: Int, boyut: KonserveBoyutu) {
    when (boyut) {
        KonserveBoyutu.KUCUK -> println("Toplam maliyet:${adet * 30}")
        KonserveBoyutu.ORTA -> println("Toplam maliyet:${adet * 40}")
        KonserveBoyutu.BUYUK -> println("Toplam maliyet:${adet * 50}")
    }

}

fun showStars(teamName: Teams): Int {

    val starsNumber = when (teamName) {
        Teams.FENERBAHCE -> 3
        Teams.BESIKTAS -> 3
        Teams.GALATASARAY -> 4
        Teams.TRABZONSPOR -> 2
    }
    return starsNumber

}