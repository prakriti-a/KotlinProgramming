package com.prakriti.kotlinprogramming

fun main() {
    var outerObj = OuterClass()
    var staticObj = OuterClass.StaticInnerClass() // did not called constructor of outer class
    var nonStaticObj = OuterClass().NonStaticInnerClass() // put () after enclosing class name
        // as constructor of outer class needs to be called in case of non static class
    nonStaticObj.printName()

    var mySingletonObject = myNewClass.singleObjectInstance // cannot use () as constructor is private
        // so use companion obj val to instantiate obj & constructor is then run
    mySingletonObject.myVar = "Singleton text changed"
    println(mySingletonObject.myVar)
    // creating another instance
    var nextSingleObj = myNewClass.singleObjectInstance // constructor is not run again
    println(nextSingleObj.myVar)
    // both objs are references to the same var

}

class OuterClass {

    private var name = "hello classes"

    class StaticInnerClass {
        // 'inner' keyword missing means static class
        // static class cannot access members of enclosing class
        fun printName() {
            // println(name) -> error
        }
    }

    inner class NonStaticInnerClass {
        fun printName() {
            println(name)
        }
    }
}

// singleton classes -> instantiated only once
class myNewClass {
    var myVar = "Singleton"

    private constructor() { // to ensure that class is singleton, make constructor private
        // constructor called every time obj is instantiated
        println("$myVar is set")
    }

    companion object {
        // to create a singleton
        val singleObjectInstance: myNewClass by lazy { myNewClass() }
        // lazy -> obj of type {x} is created only once, & each time only references are created to this instance
        // every time this instance is sent back

    }
}