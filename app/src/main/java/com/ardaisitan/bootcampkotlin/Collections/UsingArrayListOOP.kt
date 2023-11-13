package com.ardaisitan.bootcampkotlin.Collections

fun main() {
    val ogrenci1 = Ogrenciler("Arda", "Işıtan", "9C", 100)
    val ogrenci2 = Ogrenciler("Mehmet", "Kaya", "10A", 200)
    val ogrenci3 = Ogrenciler("Hasan", "Kol", "11B", 300)


    val ogrencilerListesi = ArrayList<Ogrenciler>()

    ogrencilerListesi.add(ogrenci1)
    ogrencilerListesi.add(ogrenci2)
    ogrencilerListesi.add(ogrenci3)


    for (ogrenci in ogrencilerListesi) {
        println("Ogrenci ad:${ogrenci.ad} - Ogrenci Soyad:${ogrenci.soyad} - Ogrenci Sinif:${ogrenci.sinif} - Ogrenci No:${ogrenci.no}")
    }


    // Siralama(Sort islemi) Veri tabanlarinda bu siralama ASC:ascend siralama olarak gecer.(ascend:Yukselmek)
    println("Sayisal : Kucukten Buyuge -> ")
    val siralama1 =
        ogrencilerListesi.sortedWith(compareBy { it.no }) // No'lari kucukten buyuge siralar
    for (ogrenci in siralama1) {
        println("Ogrenci ad:${ogrenci.ad} - Ogrenci Soyad:${ogrenci.soyad} - Ogrenci Sinif:${ogrenci.sinif} - Ogrenci No:${ogrenci.no}")
    }

    println("Sayisal : Buyukten Kucuge ->") //Veri tabanlarinda bu siralama DESC:descend siralama olarak gecer.(descent:Dusmek)
    val siralama2 = ogrencilerListesi.sortedWith(compareByDescending { it.no })
    for (ogrenci in siralama2) {
        println("Ogrenci ad:${ogrenci.ad} - Ogrenci Soyad:${ogrenci.soyad} - Ogrenci Sinif:${ogrenci.sinif} - Ogrenci No:${ogrenci.no}")
    }
    println("********************")

    // Siralama(Sort islemi) Veri tabanlarinda bu siralama ASC:ascend siralama olarak gecer.(ascend:Yukselmek)
    println("Metinsel : Kucukten Buyuge -> ")
    val siralama3 =
        ogrencilerListesi.sortedWith(compareBy { it.ad }) // No'lari kucukten buyuge siralar
    for (ogrenci in siralama3) {
        println("Ogrenci ad:${ogrenci.ad} - Ogrenci Soyad:${ogrenci.soyad} - Ogrenci Sinif:${ogrenci.sinif} - Ogrenci No:${ogrenci.no}")
    }

    println("Metinsel : Buyukten Kucuge ->") //Veri tabanlarinda bu siralama DESC:descend siralama olarak gecer.(descent:Dusmek)
    val siralama4 = ogrencilerListesi.sortedWith(compareByDescending { it.ad })
    for (ogrenci in siralama4) {
        println("Ogrenci ad:${ogrenci.ad} - Ogrenci Soyad:${ogrenci.soyad} - Ogrenci Sinif:${ogrenci.sinif} - Ogrenci No:${ogrenci.no}")
    }

    println("******************")

    //Filtreleme(Filter) Arama islemlerini de filtreleme yontemiyle yapabilirim.
    println("No > 150")
    println("Filtreleme1")
    val filtreleme1 =
        ogrencilerListesi.filter { it.no > 150 } // Nolari 150'den buyuk olanlari filtrele
    for (ogrenci in filtreleme1) {
        println("Ogrenci ad:${ogrenci.ad} - Ogrenci Soyad:${ogrenci.soyad} - Ogrenci Sinif:${ogrenci.sinif} - Ogrenci No:${ogrenci.no}")
    }


    println("Filtreleme2")
    val filtreleme2 =
        ogrencilerListesi.filter { (it.ad).contains("e") } // e harfi icerenleri filtrele
    for (ogrenci in filtreleme2) {
        println("Ogrenci ad:${ogrenci.ad} - Ogrenci Soyad:${ogrenci.soyad} - Ogrenci Sinif:${ogrenci.sinif} - Ogrenci No:${ogrenci.no}")
    }




}


