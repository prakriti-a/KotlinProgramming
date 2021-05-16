package com.prakriti.kotlinprogramming

fun main() {
    var myVar = GenClass("Kotlin")
    var num = GenClass(20)

    var intArray = ArrayList<Int>()
    intArray.add(2)
    intArray.add(4)
    intArray.add(6)
    intArray.addTwoNumbers(intArray[0], intArray[1])
}

class GenClass<T>(kind: T) {

    init {
        println(kind)
    }
}

// extension fn -> can be used by all arraylists of int values
fun ArrayList<Int>.addTwoNumbers(num1:Int, num2:Int): Int {
    var res = num1 + num2
    println(res)
    return res
}

