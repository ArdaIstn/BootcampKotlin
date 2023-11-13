package com.ardaisitan.bootcampkotlin.OOP.UsingOverride

open class Memeli : Hayvan() {
    override fun sesCikar() {
        super.sesCikar()
        println("Memeli Ses cikar")
    }


    /*
    override fun sesCikar() {
        super.sesCikar()
    }

     */

    // Super kw = Ust classı temsil eder.(Hayvan)
    // this kw = bulundugu sinifi temsil eder.(Memeli)

}