package com.prakriti.kotlinprogramming

fun main() {
    //
    var comp = Windows()
    println(comp.getName())
    println(comp.getRam())

   // var myAnimal = Animal() -> error
    var myDog = Dog()
    println(myDog.getName())
    println(myDog.getInfo())
}

interface computerInterface { // can be implemented by multiple classes
    // interfaces cannot be initialized
    fun getName(): String
    fun getRam(): Int
}

interface more {
}

class Windows: computerInterface, more { // multiple interfaces...
    // not abstract, so implement methods

    override fun getName(): String {
        return "Windows 10"
    }

    override fun getRam(): Int {
        return 16
    }
}

// abstract classes -> cannot be instantiated, can be subclassed
abstract class Animal {
    // class must be abstract to hold abstract methods
    abstract fun getName(): String // abstract fn cannot be defined

    fun getInfo(): String {
        return "This is an abstract class"
    }
}

class Dog: Animal() {
    // Must implement abstract methods of superclass
    override fun getName(): String {
        return "Dog"
    }

    fun print(): String {
        return getInfo() // from super
    }
}