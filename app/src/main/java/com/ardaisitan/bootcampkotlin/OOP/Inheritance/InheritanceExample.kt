package com.ardaisitan.bootcampkotlin.OOP.Inheritance

fun main() {
    val developer = Developer("Murat", 45, "Python", "Windows")
    val webDebeloper = WebDeveloper("Hasan", 25, "Js", "Windows", "MacOs")
    val mobileDeveloper = MobileDeveloper("Arda", 24, "Kotlin", "Windows", "Playstore")



    developer.printAll()
    println("*******")
    webDebeloper.printAll()
    mobileDeveloper.printAll()
}

open class Developer(
    var name: String,
    var age: Int,
    var programmingLanguage: String,
    var osName: String
) {

    open fun printAll() {
        println("Name:$name,Age:$age,ProgrammingLanguage:$programmingLanguage,OsName:$osName")
    }

}


class WebDeveloper(
    name: String,
    age: Int,
    programmingLanguage: String,
    osName: String,
    var deploymentArea: String
) :
    Developer(name, age, programmingLanguage, osName) {

    override fun printAll() {
        super.printAll()
        println("DeploymentArea:$deploymentArea")
        println("*******")
    }

}

class MobileDeveloper(
    name: String, age: Int, programmingLanguage: String, osName: String,
    var marketName: String
) :
    Developer(name, age, programmingLanguage, osName) {
    override fun printAll() {
        super.printAll()
        println("MarketName:$marketName")
        println("**************")
    }

}