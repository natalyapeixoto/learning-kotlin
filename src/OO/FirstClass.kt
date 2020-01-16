package OO

import java.math.BigInteger
import function.getCurrentDate
import OO.Objects.retrieveDate

class Person(val name: String, var age: Int) {

    init {
        println("Object was created!")
        val bigInt = BigInteger("3")
        val date = getCurrentDate()
        val ob = retrieveDate()
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name")
    }

//    fun getYearOfBirth(): Int {
//        return 2020 - age
//    }

    fun getYearOfBirth() = 2020 - age

}

fun main(args: Array<String>) {
    val person = Person("Natalya", 30)

    println(person.name)
    println(person.age)

    println(person.speak())
    println(person.greet("you"))

    println(person.getYearOfBirth())
}