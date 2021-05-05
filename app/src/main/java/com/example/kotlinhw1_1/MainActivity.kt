package com.example.kotlinhw1_1

fun main(args: Array<String>) {

    val alice: Person = Person("Alice", 24)
    val kate = alice.copy(name = "Kate")
    println(alice.toString())   // Person(name=Alice, age=24)
    println(kate.toString())    // Person(name=Kate, age=24)
}

data class Person(var name: String, var age: Int)