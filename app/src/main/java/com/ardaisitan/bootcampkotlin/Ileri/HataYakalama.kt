package com.ardaisitan.bootcampkotlin.Ileri

import java.lang.ArithmeticException


fun main() {
    //1.Compile Error:(Calistirmadan once olur)
    /*
     val x = 10
    x = 300
     */


    //2.Exception:(Runtime Error)Uygulamayi cokerten yapilardir.Calistirma sirasinda olur.
    val a = 10
    val b = 0



    try {
        println("Bolme İslemi:${a / b}")
        println("İslem tamamlandi.")

    } catch (e: Exception) {
        println("2. sayi sifir olamaz.")

    }

    val x = 10
    val y = 5
    val array = Array(2){0}

    try {
        println("Sonuc:${x/y}")
        println("İslem tamam.")
        array[4] = 5
    }catch (e:Exception){
        if(e is ArithmeticException){
            println("2. sayi 0 olamaz.")
        }
        if(e is ArrayIndexOutOfBoundsException){
            println("Dizinin boyutunu astiniz")
        }
    }




   
}