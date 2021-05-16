package com.prakriti.kotlinprogramming

    fun main() {
        // creating object
        var myObject = MyClass("Hello", 100)
        // or -> var myObject: MyClass
        println(myObject.name) // can access properties
        println(MyClass().number) // pass parameters accordingly

//        var flower1 = Flower("Lily", "White") // calls primary or custom constructor based or ags specified
        var flower2 = Flower("Purple")
    }


class MyClass(name: String = "", number: Int = 0) {
    // parameters to class form the primary constructor

        // vars here are properties of classes
        // can also specify access modifiers as usual
    var name: String = "My Class"
    var number = 3
    var opt = null
    private var unknown = "this is private"

    init {
        // executed as soon object of this class is created/initialized
        this.name = name
        this.number = number
        println(name)
        println(number)
    }

    fun getUnknown(): String {
        return unknown
    }

}

open class Flower(colour: String) {
    var colour = ""

    init {
        println("primary constructor") // it cannot access name var
    }

    // custom constructor must always call primary constructor using this()
//    constructor(name: String, colour: String): this(colour) {
//        println("custom constructor")
//    }
}

class Rose(): Flower("") {
    var thorns = 0

//    constructor(thorns: Int, colour: String): super(colour) { // must call super class constructor if defined
//        this.thorns = thorns
//    }
}