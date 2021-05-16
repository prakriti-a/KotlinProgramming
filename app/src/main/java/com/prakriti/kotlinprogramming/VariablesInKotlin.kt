package com.prakriti.kotlinprogramming

fun main() {
    // main is a starting point
    // outputed to the console
    println("My First Kotlin App!")

    println(Game.WON)
}

fun variables() {

    // variables
    var one = "data types are inferred by compiler"
    print(one)
    var text: String = "explicitly specified data type"
    var myDecimal: Float = 2.5f
    var myPreciseDec: Double = 32.569884


    // constants
    val constantItem = "val cannot be reassigned"
    println(constantItem)


    // optionals -> can be assigned null value (null - invalid)
    var myNewVar: String? // ?
        // println(myNewVar) -> error
    myNewVar = null // allowed

    // null safety -> cannot print a var of any type if not initialized
    var mySecondVar: Int? = null
    println(mySecondVar) // works now
        // can use !! to say value is Definitely Valid (not null)
    print(mySecondVar!!)
        // if invalid, app crashes

    val myNumber: Int?
    myNumber = null
    println(myNumber)


    // concat operator
    var age = 10
    println("Age is " + age)


    // getting user input
    println("enter a value: ")
    var enter = readLine() // get input
        // readLine returns a String? value
    print("your value: " + enter)

    print("enter a number: ") // specific type of input req
    var enterNum: Int = readLine()!!.toInt()
        // raises error if we try to convert possible null values to other data types
        // !! is like casting, but app crashes in case of type mismatch. it is risky to use !! (NumberFormatException)
    println(enterNum)


    // loops
    for (theValue in 1..10) { // range is specified
        println("$theValue - this loop executes 10 times") // starting 1 to 10
    }

    // nested loops
    for (outer in 1..10) {
        println("$outer - nested outer")
        for (inner in 1..3) {
            println("$inner --- nested inner")
        }
    }
}
        // enums
        enum class Game {
            WON, LOSS
        }


