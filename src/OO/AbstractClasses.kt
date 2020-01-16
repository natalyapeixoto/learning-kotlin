package OO

//Using open keyword like in the Inheritance example, allows us to still instaciate the class Person. But if the case
// is that we only want to have students and Employees we can create an abstract Class, which cannot be instanciated.
// And we can do it by adding the abstract keyword we see bellow:
abstract class Person4(open val name: String, open var age: Int) {

    init {
        println("Object was created")
    }

    abstract fun speak()

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - age

}

class Student2(override val name: String, override var age: Int, val studentID: Long): Person4(name, age) {
    fun isIntelligent() = true

    override fun speak() {
        println("Hi there, world! I'm a student!")
    }
}

class Employee2(override val name: String, override  var age: Int): Person4(name, age) {
    fun receivedPayment() {
        println("The Cash is in !")
    }

    override fun speak() {
        println("Hi! I work!")
    }
}


fun main(args: Array<String>) {

    val studenta = Student2("Marisa", 56, 909090909090)
    studenta.speak()
    println(studenta.name)

    val trabalhador = Employee2("Roberto", 30)
    trabalhador.speak()
}

//OPEN VS ABSTRACT
// with open you can inherit and Abstract you CANT!
// with abstract you HAVE to inherit and you have to override properties and methods that are abstract