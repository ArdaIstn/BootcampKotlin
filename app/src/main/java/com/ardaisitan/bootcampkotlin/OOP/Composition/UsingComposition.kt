package com.ardaisitan.bootcampkotlin.OOP.Composition

fun main() {
    val k1 = Kategoriler(1, "Dram")
    val k2 = Kategoriler(2, "Bilim Kurgu")

    val y1 = Yonetmenler(1, "Quentin Tarantino")
    val y2 = Yonetmenler(2, "Christopher Nolan")


    val f1 = Filmler(1, "Django", 2013, k1, y1)


    val f2 = Filmler(2, "Inception", 2006, k2, y2)

    println("Film id:${f1.film_id}")
    println("Film Adı:${f1.film_adi}")
    println("Film Yıl:${f1.film_yili}")
    println("Film Kategori:${f1.kategori.kategori_ad}")
    println("Film Yonetmeni:${f1.yonetmen.yonetmen_ad}")
    println("*************************")
    println("Film id:${f2.film_id}")
    println("Film Adı:${f2.film_adi}")
    println("Film Yıl:${f2.film_yili}")
    println("Film Kategori:${f2.kategori.kategori_ad}")
    println("Film Yonetmeni:${f2.yonetmen.yonetmen_ad}")
    println("*****************************")

    val adres = Adres("Samsun", "Atakum")
    val kisi1 = Kisiler("Arda", "Işıtan", adres)

    println("Kisi1 ad:${kisi1.ad}")
    println("Kisi1 Soyad:${kisi1.soyad}")
    println("Kisi1 il:${kisi1.adres.il}")
    println("Kisi1 ilce:${kisi1.adres.ilce}")


}

class Adres(var il: String, var ilce: String) {

}

class Kisiler(var ad: String, var soyad: String, var adres: Adres) {

}