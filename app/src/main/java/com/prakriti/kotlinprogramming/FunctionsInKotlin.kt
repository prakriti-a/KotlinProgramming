package com.prakriti.kotlinprogramming

    var globalVar = 100

    fun main() {
        println("main")
        functions() // fn call

        var sum = add(3, 5) // pass arguments
        println(sum)
        println(add(3,7))

        noReturn("nothing to return")

        defaultParams() // can call with or without args

        printArg(8.65)

        var localVar = 50

        globalVar = 150
        println(globalVar)
    }

    // ========================================================================================= //

    fun functions() {
        // local scope
        println("inside my local fn")
    }

    // syntax for returning values from fn
    // type is required for parameters
    fun add(first: Int, second: Int): Int {  // indicates return type
        //  dot qualified operations cannot be performed on Nullable variables (optionals)
        return first + second
    }

    // explicitly specifying that a fn Does NOT return a value
    fun noReturn(text: String): Unit {
        println(text)
        // return text -> error
    }

    // default value for parameters
    fun defaultParams(one: Int = 10, two: Int = 2) {
        println(one * two)
    }

    // polymorphism
    fun printArg(item: String) {
        println(item)
    }

    fun printArg(item: Int) {
        println(item)
    }

    fun printArg(item: Double) {
        println(item)
    }
