package com.ardaisitan.bootcampkotlin.OOP.UsingOverride

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() // Kalitim yok,kendi sinifina eristi.
    memeli.sesCikar() // kalitim var,super ile ust sinifi ve kendi sinifinin metodunu kullandi.
    kedi.sesCikar()   // Kalitim var,kendi sinifinin metodunu kullandi.
    kopek.sesCikar()  // Kalitim var,kendi sinifinin metodunu kullandi.

    // Function overload ile Function override'nin farki Function Override kullanmamiz icin kalitim iliskisi olmasi lazim.



}