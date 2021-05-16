package com.prakriti.kotlinprogramming

fun main() {
    var myPerson = Person()
    myPerson.name = "Jake"
    println(myPerson.name)

    var myStudent = Student()
    myStudent.name = "Amy"
    println(myStudent.name)
    myStudent.studentID = 100
    println(myStudent.studentID) // put !! in case of error bcoz studentID is optional

    // access mods
    myPerson.one = "access public"
    println(myPerson.one)

    myPerson.myMethod()
    myStudent.myMethod()

    // casting
    var personTwo: Person = Student() // up casting -> automatically occurs coz is-a relationship
    println(personTwo.aPerson)
//    var studentTwo: Student = Person() as Student // down casting -> not automatic, Class Cast exception

    myStudent.callPrint()

}

open class Person { // final by default, put open to inherit it
    var name: String? = null
    var age: Int? = null

    public var one = "public" // default
    private var two = "private"
    protected var three = "protected" // accessible to subclass

    var aPerson = "super class"

    open fun myMethod() { // needs to be open (final by default)
        println("Person: " + name)
    }

    fun print() {
        println("I am a person")
    }
}

// syntax for extending classes
class Student(): Person() { // call default constructor by ()
    var studentID: Int? = null

    fun accessVars() {
        three = "access protected"
    }

    // overriding methods
    override fun myMethod() { // add keyword to override
        // auto-adds super() call
        println("Student: " + name)
    }

    fun callPrint() {
        // can only call public or protected methods
        super.print()
        println("I am a student")

    }
}