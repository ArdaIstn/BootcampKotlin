package com.ardaisitan.bootcampkotlin.OOP.Composition

data class Filmler(
    var film_id: Int,
    var film_adi: String,
    var film_yili: Int,
    var kategori: Kategoriler,
    var yonetmen: Yonetmenler
) {
}