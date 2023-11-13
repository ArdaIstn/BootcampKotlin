package com.ardaisitan.bootcampkotlin.OOP

fun main() {
    // 1 Km olarak verilen bir degeri mil'e cevirme.

    println(kmToMil(25.97))
    println("*******")


    //2(Kisa ve uzun kenari girilen dikdörtgenin alanini hesaplama)
    calculateArea(30, 30)

    println("*******")


    //3 Parametre olarak girilen sayinin faktoriyelini hesaplama
    val factorialResult = calculateFactorial(5)

    if (factorialResult == -1) {
        println("please enter a number which is bigger than 0!")
    } else {
        println(factorialResult)
    }




    println("*******")

    //Parametre olarak girilen bir kelimede kaç adet e harfi olduğunu gösteren metod.
    val result = normalFunction("mehmet")

    if (result == 0) {
        println("no e letter in your word.")
    } else {
        println("You have $result e letter in your word.")
    }

    println("****************************")


    // Parametre	olarak	girilen	kenar	sayısına	göre	iç	açılar	toplamını	hesaplayıp	sonucu geri	gönderen	metod
    val angleSum = calculateAngleSum(4)
    println("4 Kenar : $angleSum")
    println("5 Kenar :${calculateAngleSum(5)}")

    println("*****************")


    /*
    Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
    yazınız.
    • 1 günde 8 saat çalışılabilir.
    • Çalışma saat ücreti : 40 ₺
    • Mesai saat ücreti : 80 ₺
    • 150 saat üzeri mesai sayılır
     */

    val daysWorked = 5
    println("Days Worked:$daysWorked")
    println("Salary:${calculateSalary(daysWorked)}")

    val daysWorked2 = 20
    println("Days Worked:$daysWorked2")
    println("Salary:${calculateSalary(daysWorked2)}")

    println("***************************")

    /*
    Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu
    yazınız.
    •1 saat = 50₺
    •1 saat aşımından sonra her 1 saat,10₺’dir
     */
    val hour1 = 3
    val hour2 = 4
    val hour3 = 5
    val hour4 = 0

    println("Hour1:$hour1,Park Fee :${calculateCarParkFee(hour1)}")
    println("Hour2:$hour2,Park Fee :${calculateCarParkFee(hour2)}")
    println("Hour3:$hour3,Park Fee :${calculateCarParkFee(hour3)}")

    if (calculateCarParkFee(hour4) == 0){
        println("Your number should be bigger than 0 !")
    }
}

//*******************************************************************


fun kmToMil(km: Double): Double {
    val mil = km * 0.621
    return mil
}
//*********************************

fun calculateArea(shortEdge: Int, longEdge: Int) {
    val area = shortEdge * longEdge

    if (shortEdge > 0 && longEdge > 0) {
        if (longEdge < shortEdge) {
            println("Long edge should be bigger than short edge!")
        } else if (longEdge == shortEdge) {
            println("Long edge and short edge should not be equal!")
        } else {
            println("Rectangle area is :$area")
        }
    } else {
        println("Short and Long edge must  be bigger than 0 !! ")
    }

}

//*********************************

fun calculateFactorial(number: Int): Int {

    if (number < 0) {
        return -1
    }

    var factorialResult = 1


    for (value in 1..number) {
        factorialResult *= value
    }
    return factorialResult

}
//***********************************

fun normalFunction(word: String): Int {
    var number = 0

    for (letter in word) {
        if (letter == 'e') {
            number += 1
        }
    }
    return number

}


//******************************

fun calculateAngleSum(sideNumber: Int): Int {
    val angleSum = ((sideNumber - 2) * 180) / sideNumber

    return angleSum
}

// *****************************

fun calculateSalary(dayNumber: Int): Int {
    var totalSalary = 0
    val workingHour = dayNumber * 8
    val workingHourWage = workingHour * 40

    if (workingHour > 150) {
        val overtime = workingHour - 150
        totalSalary = workingHourWage + (overtime * 80)

        return totalSalary

    } else {
        totalSalary = workingHourWage
        return totalSalary
    }


}

// ************************************

fun calculateCarParkFee(hour: Int): Int {
    var calculateFee = 0

    if (hour == 1) {
        calculateFee = 50
        return calculateFee
    }
    if (hour > 1) {
        calculateFee = 50 + ((hour - 1) * 10)
        return calculateFee
    } else {
        return 0
    }


}





